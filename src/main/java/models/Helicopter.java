package models;

import coordinates.Coordinates;

public class Helicopter extends AirVehicle{

    @Override
    public Coordinates move(Coordinates coordinates) {
        return null;
    }

    @Override
    public int capacity() {
        return 0;
    }
}