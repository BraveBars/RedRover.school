package com.hw10.task3;

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
