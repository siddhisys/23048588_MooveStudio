package com.Moooveapp.controller.algorithms;

import com.Mooveapp.model.MooveModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for sorting a list of MooveModel objects.
 * This classes sorts the serial number using selection sort algorithm.
 * 
 * @author Siddhi
 * LMUID 23048588
 */
public class SelectionSort {

    public List<MooveModel> sortByserialNo(List<MooveModel> unsortedData, boolean isDesc) {

        //creating a copy of the original list to avoid changing it.
        List<MooveModel> dataToSort = new ArrayList();
        dataToSort.addAll(unsortedData);

        //loop through the list to sort for each element
        for (int i = 0; i < dataToSort.size() - 1; i++) {
            //min value
            int minIndex = i;
            //Find either the smallest ot lasrgest element in the remaining list
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
            //swap the found element with the current element.
            MooveModel tempStudent = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempStudent);
        }
        return dataToSort;//return the sorted list
    }
}
