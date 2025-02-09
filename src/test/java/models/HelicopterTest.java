package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelicopterTest {

    @Test
    public void classImplementsVehical(){
        Class<Helicopter> helicopterClass = Helicopter.class;
        Class<Vehicle> vehicleClass = Vehicle.class;
        assertTrue(vehicleClass.isAssignableFrom(helicopterClass));
    }


    @Test
    public void correctFuelType(){
        Helicopter helicopter = new Helicopter();
        assertEquals("Aviation Gasoline",helicopter.fuelType());
    }

    @Test
    public void correctVehicleType(){
        Helicopter helicopter = new Helicopter();
        assertEquals("Air",helicopter.vehicleType());
    }

}
