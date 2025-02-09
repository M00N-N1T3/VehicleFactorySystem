package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TruckTest {
    @Test
    public void classImplementsVehical(){
        Class<Truck> truckClass = Truck.class;
        Class<Vehicle> vehicleClass = Vehicle.class;
        assertTrue(vehicleClass.isAssignableFrom(truckClass));
    }


    @Test
    public void correctFuelType(){
        Truck truck = new Truck();
        assertEquals("Petrol",truck.fuelType());
    }

    @Test
    public void correctVehicleType(){
        Truck truck = new Truck();
        assertEquals("Land",truck.vehicleType());
    }
}
