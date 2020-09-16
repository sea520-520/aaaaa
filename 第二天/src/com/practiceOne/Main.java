package com.practiceOne;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(11d,11d);
        System.out.println(vehicle);
        vehicle.speedUp(12d);
        System.out.println(vehicle);
        vehicle.speedDown(10d);
        System.out.println(vehicle);
    }
}
