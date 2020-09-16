package com.homework;

public class Phone {

    private Double screenSzie;

    private String brand;

    private String cpu;

    private String memory;

    public Phone(Double screenSzie, String brand, String cpu, String memory) {
        this.screenSzie = screenSzie;
        this.brand = brand;
        this.cpu = cpu;
        this.memory = memory;
    }

    public Double getScreenSzie() {
        return screenSzie;
    }

    public void setScreenSzie(Double screenSzie) {
        this.screenSzie = screenSzie;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "screenSzie=" + screenSzie +
                ", brand='" + brand + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
