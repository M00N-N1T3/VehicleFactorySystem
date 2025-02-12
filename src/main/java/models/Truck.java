package models;

import coordinates.Coordinates;

public class Truck extends LandVehicle{
    private final String vehicle = "Truck";

    @Override
    public Coordinates move(Coordinates coordinates) {
        return null;
    }

    @Override
    public int capacity() {
        return 3;
    }

    public String getVehicle() {
        return vehicle;
    }
}