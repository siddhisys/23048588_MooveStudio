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
 * @author Siddhi 
 * LMUID 23048588
 *
 */
public class InsertionSort {

    List<MooveModel> scheduleList;

    public InsertionSort() {
        scheduleList = new ArrayList<>();
    }

    /**
     * Sorts a list of MooveModel objects by their instructor's names in
     * ascending or descending order.
     *
     * @param scheduleList the list of MooveModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<MooveModel> sortByInstructor(List<MooveModel> scheduleList, boolean isDesc) {
        this.scheduleList.clear();
        this.scheduleList.addAll(scheduleList);

        if (this.scheduleList == null || this.scheduleList.isEmpty()) {
            throw new IllegalArgumentException("Schedule list cannot be null or empty.");
        }

        // Perform insertion sort
        for (int i = 1; i < this.scheduleList.size(); i++) {
            for (int j = i; j > 0 && shouldSwap(this.scheduleList.get(j).getInstructor(), this.scheduleList.get(j - 1).getInstructor(), isDesc); j--) {
                // Swap instructors
                swap(this.scheduleList, j, j - 1);
            }
        }

        return this.scheduleList;
    }

    /**
     * Determines if two instructors should be swapped based on the sorting
     * order.
     *
     * @param current the current instructor's name
     * @param previous the previous instructor's name
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the swap condition is met, false otherwise
     */
    private boolean shouldSwap(String current, String previous, boolean isDesc) {
        return isDesc ? current.compareToIgnoreCase(previous) > 0 : current.compareToIgnoreCase(previous) < 0;
    }

    /**
     * Swaps two MooveModel objects in the list by updating their instructor
     * names.
     *
     * @param list the list of MooveModel objects
     * @param i the index of the first object
     * @param j the index of the second object
     */
    private void swap(List<MooveModel> list, int i, int j) {
        MooveModel temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
