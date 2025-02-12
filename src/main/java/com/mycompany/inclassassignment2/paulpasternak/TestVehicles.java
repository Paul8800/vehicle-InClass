/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inclassassignment2.paulpasternak;

/**
 *
 * @author Paul Pasternak
 */
public class TestVehicles {
    
    //Vehicle car1 = new Vehicle("car", "regular", "black");
    

    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Gasoline", "Red");
        Vehicle truck = new Truck("Ford", "Diesel", "Blue", 8);
        Vehicle bus = new Bus("Mercedes", "Electric", "Yellow");

        // Test the attributes of your vehicles
        System.out.println("Car make: " + car.getMake());
        System.out.println("Truck bed size: " + ((Truck) truck).getBedSize());
        System.out.println("Bus color: " + bus.getColour());
    }

    
}
