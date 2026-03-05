package com.hw10.task3;

public class Car extends LandVehicle {
    private String fuelType;
    private int doors;

    public Car(String brand, String model, int year, int maxSpeed, int wheelCount, String fuelType, int doors) {
        super(brand, model, year, maxSpeed, wheelCount);
        this.fuelType = fuelType;
        this.doors = doors;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String describe() {
        return "Car - " + getVehicleInfo() + ", doors - " + doors;
    }

    @Override
    public void honk() {
        System.out.println("Beep-beep");
    }
}
