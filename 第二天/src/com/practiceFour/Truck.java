package com.practiceFour;

public class Truck extends Vehicles{

    private float load;


    public Truck(String brand, String color, float load) {
        super(brand, color);
        this.load = load;
    }

    public void showTruck() {
        System.out.println("卡车的信息：" + "品牌：" + super.getBrand() + " 颜色：" + super.getColor() +
                " 座位：" + load);
    }
}
