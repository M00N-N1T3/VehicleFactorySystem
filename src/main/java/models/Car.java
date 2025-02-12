package models;

import coordinates.Coordinates;

public class Car extends LandVehicle{
    private final String vehicle = "Car";

    @Override
    public Coordinates move(Coordinates coordinates) {
        return null;
    }

    @Override
    public int capacity() {
        return 4;
    }

    public String getVehicle() {
        return vehicle;
    }
}