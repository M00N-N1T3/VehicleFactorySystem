package models;

import coordinates.Coordinates;

public class Bike extends LandVehicle{
    private final String vehicle = "Bike";

    @Override
    public Coordinates move(Coordinates coordinates) {
        return null;
    }

    @Override
    public int capacity() {
        return 2;
    }

    public String getVehicle() {
        return vehicle;
    }
}