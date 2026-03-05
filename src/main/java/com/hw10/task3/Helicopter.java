package com.hw10.task3;

public class Helicopter extends AirVehicle {
    private double rotorDiameter;

    public Helicopter(String brand, String model, int year, int maxSpeedKmh, int maxAltitudeMeters, double rotorDiameter) {
        super(brand, model, year, maxSpeedKmh, maxAltitudeMeters);
        this.rotorDiameter = rotorDiameter;
    }

    public double getRotorDiameter() {
        return rotorDiameter;
    }

    @Override
    public void landing() {
        System.out.println(getBrand() + " " + getModel() + " takes off vertically");
    }

    @Override
    public String describe() {
        return "Helicopter - " + getVehicleInfo() + ","
                + " max altitude - " + getMaxAltitudeMeters()
                + " rotor diameter - " + rotorDiameter;
    }
}
