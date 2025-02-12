/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inclassassignment2.paulpasternak;

/**
 *
 * @author Paul Pasternak
 */
public class Truck extends Vehicle{
    private int bedSize;

    public Truck(String make, String fuel, String color, int bedSize) {
        super(make, fuel, color);
        this.bedSize = bedSize;
    }
    
    int getBedSize(){
        return this.bedSize;
    }
    
    void setBedSize(int bedSize){
        this.bedSize = bedSize;
    }
    
}
