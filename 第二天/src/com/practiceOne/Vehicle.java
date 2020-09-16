package com.practiceOne;

public class Vehicle {

    private Double speed;

    private Double size;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Vehicle(Double speed, Double size) {
        this.speed = speed;
        this.size = size;
    }

    public Vehicle() {

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", size=" + size +
                '}';
    }

    public void speedUp(Double speed) {
        this.speed = this.speed + speed;
    }

    public void speedDown(Double speed) {
        this.speed = this.speed - speed;
    }
}
