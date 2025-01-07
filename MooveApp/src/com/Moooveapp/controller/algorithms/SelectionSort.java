package com.Moooveapp.controller.algorithms;

import com.Mooveapp.model.MooveModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for sorting a list of MooveModel objects.
 *
 * @author Siddhi LUMID 23048588
 */
public class SelectionSort {

    public List<MooveModel> sortByserialNo(List<MooveModel> unsortedData, boolean isDesc) {

        List<MooveModel> dataToSort = new ArrayList();
        dataToSort.addAll(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // compare and assign
                if (isDesc) {
                    if (dataToSort.get(j).getSerialNo() > dataToSort.get(minIndex).getSerialNo()) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getSerialNo() < dataToSort.get(minIndex).getSerialNo()) {
                        minIndex = j;
                    }
                }
            }
            //swap
            MooveModel tempStudent = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempStudent);
        }
        return dataToSort;
    }

    public List<MooveModel> sortByClassName(List<MooveModel> unsortedData, boolean isDesc) {
        if (unsortedData == null || unsortedData.isEmpty()) {
            throw new IllegalArgumentException("The unsorted data list cannot be null or empty.");
        }

        List<MooveModel> dataToSort = new ArrayList<>(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                if (isDesc) {
                    if (dataToSort.get(j).getClassName().compareToIgnoreCase(dataToSort.get(minIndex).getClassName()) > 0) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getClassName().compareToIgnoreCase(dataToSort.get(minIndex).getClassName()) < 0) {
                        minIndex = j;
                    }
                }
            }
            MooveModel temp = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, temp);
        }
        return dataToSort;
    }
}
