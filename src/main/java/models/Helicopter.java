package models;

import coordinates.Coordinates;

public class Helicopter extends AirVehicle{
    private final String vehicle = "Helicopter";

    @Override
    public Coordinates move(Coordinates coordinates) {
        return null;
    }

    @Override
    public int capacity() {
        return 6;
    }

    public String getVehicle() {
        return vehicle;
    }
}