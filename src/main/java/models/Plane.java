package models;

import coordinates.Coordinates;

public class Plane extends AirVehicle{
    private final String vehicle = "Plane";

    @Override
    public Coordinates move(Coordinates coordinates) {
        return null;
    }

    @Override
    public int capacity() {
        return 0;
    }

    public String getVehicle() {
        return vehicle;
    }
}