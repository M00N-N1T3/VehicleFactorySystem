package models;

import coordinates.Coordinates;

abstract class LandVehicle  implements Vehicle{
    String fuelType = "Petrol";

    @Override
    abstract public Coordinates move(Coordinates coordinates);

    @Override
    public String fuelType(){
        return fuelType;
    };

    @Override
    abstract public int capacity();
}
