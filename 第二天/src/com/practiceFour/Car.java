package com.practiceFour;

import java.awt.*;

public class Car extends Vehicles{

    private int seats;


    public Car(String brand, String color,int seats) {
        super(brand, color);
        this.seats = seats;
    }

    public void showCar() {
        System.out.println("小车信息：" + "品牌：" + super.getBrand() + " 颜色：" + super.getColor() +
                " 座位：" + seats);
    }
}
