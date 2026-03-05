package com.hw10.task3;

public class Sailboat extends WaterVehicle {
    private int maxHeight;

    public Sailboat(String brand, String model, int year, int maxSpeed, double displacementTons, int maxHeight) {
        super(brand, model, year, maxSpeed, displacementTons);
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void sail() {
        System.out.println(getBrand() + " " + getModel() + " sets sail");
    }

    @Override
    public String describe() {
        return "Sailing boat - " + getVehicleInfo() + ", max. height - " + maxHeight;
    }
}
