package models;

import coordinates.Coordinates;

public class Car extends LandVehicle{

    @Override
    public Coordinates move(Coordinates coordinates) {
        return null;
    }

    @Override
    public int capacity() {
        return 0;
    }
}