package models;

abstract class AirVehicle implements Vehicle {
    private final String fuelType = "Aviation Gasoline";
    private final String type ="Air";

    @Override
    public String fuelType() {
        return fuelType;
    }

    @Override
    public String vehicleType() {
        return type;
    }
}
