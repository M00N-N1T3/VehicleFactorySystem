package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void classImplementsVehical(){
        Class<Car> carClass = Car.class;
        Class<Vehicle> vehicleClass = Vehicle.class;
        assertTrue(vehicleClass.isAssignableFrom(carClass));
    }


    @Test
    public void correctFuelType(){
        Car car = new Car();
        assertEquals("Petrol",car.fuelType());
    }

    @Test
    public void correctVehicleType(){
        Car car = new Car();
        assertEquals("Land",car.vehicleType());
    }

}
