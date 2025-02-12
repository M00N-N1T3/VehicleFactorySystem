package models;
import coordinates.Coordinates;

public interface Vehicle {

    Coordinates move(Coordinates coordinates);

    String fuelType();

    String vehicleType();

    String getVehicle();

    int capacity();
}
