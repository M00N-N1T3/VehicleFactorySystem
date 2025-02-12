package factory;

import models.Vehicle;
import org.junit.jupiter.api.Test;
import models.Exceptions.vehicleNotFound;
import static org.junit.jupiter.api.Assertions.*;


public class VehicleFactoryTest {

    @Test
    public void createBike(){
        Vehicle vehicle = new VehicleFactory().getInstanceOf("bike");
        assertEquals("Bike",vehicle.getVehicle());
        assertEquals("Land",vehicle.vehicleType());
        assertEquals("Petrol",vehicle.fuelType());
        assertEquals(2,vehicle.capacity());
    }

    @Test
    public void createTruck(){
        Vehicle vehicle = new VehicleFactory().getInstanceOf("truck");
        assertEquals("Truck",vehicle.getVehicle());
        assertEquals("Land",vehicle.vehicleType());
        assertEquals("Petrol",vehicle.fuelType());
        assertEquals(3,vehicle.capacity());
    }

    @Test
    public void createCar(){
        Vehicle vehicle = new VehicleFactory().getInstanceOf("car");
        assertEquals("Car",vehicle.getVehicle());
        assertEquals("Land",vehicle.vehicleType());
        assertEquals("Petrol",vehicle.fuelType());
        assertEquals(4, vehicle.capacity());
    }

    @Test
    public void createBoat(){
        Vehicle vehicle = new VehicleFactory().getInstanceOf("boat");
        assertEquals("Boat",vehicle.getVehicle());
        assertEquals("Water",vehicle.vehicleType());
        assertEquals("Marine Diesel",vehicle.fuelType());
        assertEquals(8, vehicle.capacity());
    }

    @Test
    public void createHelicopter(){
        Vehicle vehicle = new VehicleFactory().getInstanceOf("helicopter");
        assertEquals("Helicopter",vehicle.getVehicle());
        assertEquals("Air",vehicle.vehicleType());
        assertEquals("Aviation Gasoline",vehicle.fuelType());
        assertEquals(6, vehicle.capacity());
    }

    @Test
    public void createPlane(){
        Vehicle vehicle = new VehicleFactory().getInstanceOf("helicopter");
        assertEquals("Plane",vehicle.getVehicle());
        assertEquals("Air",vehicle.vehicleType());
        assertEquals("Aviation Gasoline",vehicle.fuelType());
        assertEquals(50, vehicle.capacity());
    }

    @Test
    public void throwsNoVehicleError(){


        vehicleNotFound expect = assertThrows( vehicleNotFound.class ,() -> {
            new VehicleFactory().getInstanceOf("UFO");
        });

        assertEquals("Error: vehicle not valid in the system.",expect.getMessage());
    }

}
