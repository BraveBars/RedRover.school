package com.hw10.task3;

public class Airplane extends AirVehicle {
    private int passengerCount;

    public Airplane(String brand, String model, int year, int maxSpeedKmh, int maxAltitudeMeters, int passengerCount) {
        super(brand, model, year, maxSpeedKmh, maxAltitudeMeters);
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public void landing() {
        System.out.println(getBrand() + " " + getModel() + " is coming in for landing");
    }

    @Override
    public String describe() {
        return "Airplane - " + getVehicleInfo() + ","
                + " max altitude - " + getMaxAltitudeMeters()
                + " max. passengers - " + passengerCount;
    }
}
