package models.Exceptions;

public class vehicleNotFound extends RuntimeException {
    public vehicleNotFound(String message) {
        super(message);
    }
    public vehicleNotFound(){
        super("Invalid vehicle type.");
    }
}
