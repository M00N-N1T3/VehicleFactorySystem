package models;

abstract class WaterVehicle implements Vehicle{
    private final String fuelType = "Marine Diesel";
    private final String type = "Water";

    @Override
    public String fuelType() {
        return fuelType;
    }

    @Override
    public String vehicleType(){
        return type;
    }
}
