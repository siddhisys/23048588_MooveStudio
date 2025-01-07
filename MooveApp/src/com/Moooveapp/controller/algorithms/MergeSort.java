/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Moooveapp.controller.algorithms;

import com.Mooveapp.model.MooveModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Siddhi LUMID 23048588
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

    private List<MooveModel> mergeSort(List<MooveModel> list, boolean isDesc) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<MooveModel> left = new ArrayList<>(list.subList(0, mid));
        List<MooveModel> right = new ArrayList<>(list.subList(mid, list.size()));

        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);

        return merge(left, right, isDesc);
    }

    private List<MooveModel> merge(List<MooveModel> left, List<MooveModel> right, boolean isDesc) {
        List<MooveModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (shouldMerge(left.get(i).getAge(), right.get(j).getAge(), isDesc)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    private boolean shouldMerge(short leftAge, short rightAge, boolean isDesc) {
        return isDesc ? leftAge > rightAge : leftAge < rightAge;
    }
}
