package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BoatTest {

    @Test
    public void classImplementsVehicle(){
         Class<Boat> boatClass = Boat.class;
         Class<Vehicle> vehicleClass = Vehicle.class;
         assertTrue(vehicleClass.isAssignableFrom(boatClass));
    }


    @Test
    public void correctFuelType(){
        Boat boat = new Boat();
        assertEquals("Marine Diesel",boat.fuelType());
    }

    @Test
    public void correctVehicalType(){
        Boat boat = new Boat();
        assertEquals("Marine Diesel",boat.fuelType());
    }


}
