package com.hw10.task3;

public class Motorboat extends WaterVehicle {
    private int enginePowerHp;

    public Motorboat(String brand, String model, int year, int maxSpeed, double displacementTons, int enginePowerHp) {
        super(brand, model, year, maxSpeed, displacementTons);
        this.enginePowerHp = enginePowerHp;
    }

    public int getEnginePowerHp() {
        return enginePowerHp;
    }

    @Override
    public void sail() {
        System.out.println(getBrand() + " " + getModel() + " starts the engine and races across the water");
    }

    @Override
    public String describe() {
        return "Motorboat - " + getVehicleInfo() + ", max. power - " + enginePowerHp;
    }
}
