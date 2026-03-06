package com.hw10.task3.vehicle.water;

import com.hw10.task3.vehicle.base.Vehicle;

abstract class WaterVehicle extends Vehicle {
    private double displacementTons;

    public WaterVehicle(String brand, String model, int year, int maxSpeed, double displacementTons) {
        super(brand, model, year, maxSpeed);
        this.displacementTons = displacementTons;
    }

    public double getDisplacementTons() {
        return displacementTons;
    }

    public void anchor() {
        System.out.println(getBrand() + " " + getModel() + " drops anchor");
    }

    public abstract void sail();
}
