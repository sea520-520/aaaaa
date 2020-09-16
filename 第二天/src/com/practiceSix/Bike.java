package com.practiceSix;


public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("开始骑单车");
    }

    @Override
    public void stop() {
        System.out.println("结束骑单车");
    }
}
