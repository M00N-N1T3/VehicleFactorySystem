package models;

import coordinates.Coordinates;

public class Boat extends WaterVehicle{

    @Override
    public Coordinates move(Coordinates coordinates) {
        return null;
    }

    @Override
    public int capacity() {
        return 0;
    }
}