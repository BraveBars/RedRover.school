package com.hw10.task3.vehicle.base;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private int maxSpeedKmh;


    public Vehicle(String brand, String model, int year, int maxSpeedKmh) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxSpeedKmh = maxSpeedKmh;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeedKmh() {
        return maxSpeedKmh;
    }

    public String getVehicleInfo() {
        return "Brand - " + brand + ", model - " + model + ", year - " + year
                + ", max. speed " + maxSpeedKmh + "km/h ";
    }

    public abstract String describe();
}
