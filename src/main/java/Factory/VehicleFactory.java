package Factory;

import models.*;
import models.Exceptions.vehicleNotFound;

public class VehicleFactory {

    public Vehicle getInstanceOf(String vehicle) throws vehicleNotFound{
        return switch (vehicle){
            case "bike" -> new Bike();
            case "car" -> new Car();
            case "boat" -> new Boat();
            case "helicopter" -> new Helicopter();
            case "truck" -> new Truck();
            case "plane" -> new Plane();
            default -> throw new  vehicleNotFound();
        };
    }
}
