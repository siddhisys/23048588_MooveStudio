/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Moooveapp.controller.algorithms;

import com.Mooveapp.model.MooveModel;
import java.util.ArrayList;
import java.util.List;

/**
 * The merge sort class provides a sorting functionality to the list.
 * It sorts the list by their age in ascending order.
 * It specifically uses merge sort algorithm for that.
 * 
 * @author Siddhi
 * LMUID 23048588
 */
public class MergeSort {

    /**
     * Sorts a list of MooveModel objects by their age in ascending or
     * descending order.
     *
     * @param scheduleList the list of MooveModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<MooveModel> sortByAge(List<MooveModel> scheduleList, boolean isDesc) {
        if (scheduleList == null || scheduleList.isEmpty()) {
            throw new IllegalArgumentException("Schedule list cannot be null or empty.");
        }
        return mergeSort(scheduleList, isDesc);
    }
    
    /**
     * It divides the list into smaller and smaller lists and sorts them using merge sort algorithm.
     * @param list of the object to be sorted
     * @param isDesc specifies the sorting order
     * @return the sorted list
     */
    private List<MooveModel> mergeSort(List<MooveModel> list, boolean isDesc) {
        if (list.size() <= 1) {//Base case: if the list has 1 or less than 1 elements 
            return list;//then it is already sorted
        }
        
        //dividing the list into 2 parts
        int mid = list.size() / 2;
        List<MooveModel> left = new ArrayList<>(list.subList(0, mid));
        List<MooveModel> right = new ArrayList<>(list.subList(mid, list.size()));
        //sort both the parts
        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);
        //merge the sorted parts together
        return merge(left, right, isDesc);
    }

    /**
     * It merges tow sorted list into a single sorted list
     * @param left the left list
     * @param right the right list
     * @param isDesc specifies the sort order
     * @return the merged and sorted list
     */
    private List<MooveModel> merge(List<MooveModel> left, List<MooveModel> right, boolean isDesc) {
        List<MooveModel> merged = new ArrayList<>();
        int i = 0, j = 0;
        //compares elements from both lists and merges them into an order
        while (i < left.size() && j < right.size()) {
            if (shouldMerge(left.get(i).getAge(), right.get(j).getAge(), isDesc)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }
        //add any elements from the left sub-list
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }
        //add any elements from the right sub-lost
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }
        return merged;
    }

    /**
     * It determines whether two ages should be merges based on the sorting order.
     * @param leftAge the current age in the left sub-list
     * @param rightAge the current age in the right sub-list
     * @param isDesc specifies the sorting order
     * @return true if the leftAge should come before the rightAge
     */
    private boolean shouldMerge(short leftAge, short rightAge, boolean isDesc) {
        return isDesc ? leftAge > rightAge : leftAge < rightAge;
    }
}
