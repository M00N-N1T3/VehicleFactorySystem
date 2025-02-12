package models;

import coordinates.Coordinates;

public class Boat extends WaterVehicle{
    private final String vehicle = "Boat";

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