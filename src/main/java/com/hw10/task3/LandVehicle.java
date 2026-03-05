package com.hw10.task3;

abstract class LandVehicle extends Vehicle {
    private int wheelCount;

    public LandVehicle(String brand, String model, int year, int maxSpeed, int wheelCount) {
        super(brand, model, year, maxSpeed);
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void drive() {
        System.out.println(getBrand() + " " + getModel() + " driving on "
                + getWheelCount() + " wheels");
    }

    public abstract void honk();
}
