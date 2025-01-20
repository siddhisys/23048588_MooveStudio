/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Mooveapp.controller.datastructure;

import com.Mooveapp.model.MooveModel;
import java.util.ArrayList;

/**
 *
 * @author Siddhi
 */
public class CustomQueue {
    private final ArrayList<MooveModel> vivaList;
    private final int capacity;
    
    public CustomQueue(int capacity){
        vivaList= new ArrayList();
        this.capacity = capacity;
    }
    
    public boolean enQueue(MooveModel schedule){
        if (isFull()) return false;
        vivaList.addLast(schedule);
        return true;
    }
    
    public MooveModel deQueue(){
        return vivaList.removeFirst();
    }
    
    public boolean isFull(){
        return vivaList.size() == capacity;
    }
    public int poll(){
        return vivaList.size();
    }
    
    public MooveModel peek(){
        return vivaList.getFirst();
    }
}
