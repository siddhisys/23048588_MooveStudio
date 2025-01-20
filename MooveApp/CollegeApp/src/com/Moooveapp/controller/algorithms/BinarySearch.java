/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Moooveapp.controller.algorithms;

import com.Mooveapp.model.MooveModel;
import java.util.List;

/**
 * This class provides a method to do binary search.
 * By first sorting out the data using serial number.
 * 
 * @author Siddhi
 * LMUID 23048588
 */
public class BinarySearch {
    
    /**
     * It does a binary search on a list of MooveModel to find an entry
     * with the mentioned serial number.
     * 
     * @param serialNo The serial number that we need to search for.
     * @param danceList A listed sorted by the serial number.
     * @param left The leftmost index of the search range.
     * @param right The rightmost index of the search range.
     * @return The MooveModel objects with the matching serial number.
     */
    public MooveModel searchBySerialNo(int serialNo, List<MooveModel> danceList, int left, int right) {
        if (danceList == null || danceList.isEmpty()) {//checks if the list is null or empty
            throw new IllegalArgumentException("The dance list cannot be null or empty.");
        }
        // Base case: If the search range is invalid, the serial number is not in the list
        if (right < left) {
            return null; // Not found
        }
        // Calculate the middle index of the current search range
        int mid = left + (right - left) / 2;
        //Retrieves the serial number at the middle index
        int currentSerialNo = danceList.get(mid).getSerialNo();
        if (currentSerialNo == serialNo) {//it compares the target serial number with the middle index
            return danceList.get(mid); // Found the serialNo
        } else if (serialNo < currentSerialNo) {//if the number is smaller than search the left half of the list
            return searchBySerialNo(serialNo, danceList, left, mid - 1); // Search left
        } else {
            //if the number is larger then search in the right half of the list
            return searchBySerialNo(serialNo, danceList, mid + 1, right);  
        }
    }}
