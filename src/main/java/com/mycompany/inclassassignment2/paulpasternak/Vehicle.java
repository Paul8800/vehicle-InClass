/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inclassassignment2.paulpasternak;

/**
 *
 * @author Paul Pasternak
 */
public class Vehicle {
    
    private String make;
    private String fuel;
    private String colour;
    
    Vehicle(String make, String fuel, String colour) {
        this.make = make;
        this.fuel = fuel;
        this.colour = colour;
    }
    
    String getMake(){
        return this.make;
    }
    
    String getFuel(){
        return this.fuel;
    }
    
    String getColour(){
        return this.colour;
    }
    
    void setMake(String make){
        this.make = make;
    }
    
    void setFuel(String fuel){
        this.fuel = fuel;
    }
    
    void setCOlour(String colour){
        this.colour = colour;
    }
    
}
