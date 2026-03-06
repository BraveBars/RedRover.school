package com.hw10.task3.vehicle.air;

import com.hw10.task3.vehicle.base.Vehicle;

abstract class AirVehicle extends Vehicle {
    private int maxAltitudeMeters;

    public AirVehicle(String brand, String model, int year, int maxSpeedKmh, int maxAltitudeMeters) {
        super(brand, model, year, maxSpeedKmh);
        this.maxAltitudeMeters = maxAltitudeMeters;
    }

    public int getMaxAltitudeMeters() {
        return maxAltitudeMeters;
    }

    public abstract void landing();
}
