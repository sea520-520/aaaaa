package com.practiceSix;

public class Bus implements Vehicle {

    @Override
    public void start() {
        System.out.println("公共汽车开始行驶");
    }

    @Override
    public void stop() {
        System.out.println("公共汽车结束行驶");
    }
}
