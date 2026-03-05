package com.hw10.task3;

public class Truck extends LandVehicle {
    private int loadCapacity;

    public Truck(String brand, String model, int year, int maxSpeed, int wheelCount, int loadCapacity) {
        super(brand, model, year, maxSpeed, wheelCount);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void honk() {
        System.out.println("Tuuuuuu");
    }

    @Override
    public String describe() {
        return "Truck - " + getVehicleInfo() + ", load capacity - " + loadCapacity;
    }
}
