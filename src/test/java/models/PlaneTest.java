package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlaneTest {

    @Test
    public void classImplementsVehical(){
        Class<Plane> planeClass = Plane.class;
        Class<Vehicle> vehicleClass = Vehicle.class;
        assertTrue(vehicleClass.isAssignableFrom(planeClass));
    }


    @Test
    public void correctFuelType(){
        Plane plane = new Plane();
        assertEquals("Aviation Gasoline",plane.fuelType());
    }

    @Test
    public void correctVehicleType(){
        Plane plane = new Plane();
        assertEquals("Air",plane.vehicleType());
    }
}
