/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Moooveapp.controller.algorithms;

import com.Mooveapp.model.MooveModel;
import java.util.List;

/**
 *
 * @author Siddhi LMUID 23048588
 */
public class BinarySearch {

    public MooveModel searchBySerialNo(int serialNo, List<MooveModel> danceList, int left, int right) {
        if (danceList == null || danceList.isEmpty()) {
            throw new IllegalArgumentException("The dance list cannot be null or empty.");
        }

        // Base case
        if (right < left) {
            return null; // Not found
        }

        // Calculate mid
        int mid = left + (right - left) / 2;

        int currentSerialNo = danceList.get(mid).getSerialNo();

        if (currentSerialNo == serialNo) {
            return danceList.get(mid); // Found the serialNo
        } else if (serialNo < currentSerialNo) {
            return searchBySerialNo(serialNo, danceList, left, mid - 1); // Search left
        } else {
            return searchBySerialNo(serialNo, danceList, mid + 1, right); // Search right
        }
    }
}
