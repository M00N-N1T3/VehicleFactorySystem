package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void classImplementInterface(){
        Class<Bike> bikeClass = Bike.class;
        Class<Vehicle> vehicleClass = Vehicle.class;
        assertTrue(vehicleClass.isAssignableFrom(bikeClass));
    }

    @Test
    public void correctFuelType(){
        Bike bike = new Bike();
        assertEquals("Petrol",bike.fuelType());
    }

    @Test
    public void correctVehicleType(){
        Bike bike = new Bike();
        assertEquals("Land",bike.vehicleType());
    }
}
