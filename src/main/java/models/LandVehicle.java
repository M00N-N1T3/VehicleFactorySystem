package models;

import coordinates.Coordinates;

abstract class LandVehicle  implements Vehicle{
    private final String fuelType = "Petrol";
    private final String type = "Land";

    @Override
    public String fuelType(){
        return fuelType;
    };

    @Override
    public String vehicleType() {
        return type;
    }
}
