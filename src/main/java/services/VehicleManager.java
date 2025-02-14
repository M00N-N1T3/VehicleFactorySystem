package services;

import factory.VehicleFactory;
import models.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VehicleManager {
    private List<Vehicle> vehicles;
    private final VehicleFactory vehicleFactory = new VehicleFactory();

    public VehicleManager(){
        this.vehicles = new ArrayList<>();
    }

    public Vehicle createVehicle(String vehicle){
       Vehicle newVehicle = vehicleFactory.getInstanceOf(vehicle);
       vehicles.add(newVehicle);
       return newVehicle;
    }

    public List<Vehicle> getAllVehicles(){
        return vehicles;
    }

    public List<Vehicle> getVehicleByType(String vehicleT) {
        return vehicles.stream().filter(
                vehicle -> vehicle.vehicleType().equalsIgnoreCase(vehicleT)).toList();
    }

    public List<Vehicle> getVehicleByFuelType(String fuelT){
        return vehicles.stream().filter(vehicle -> vehicle.fuelType().toLowerCase().contains(fuelT)).toList();
    }

    public Vehicle getVehicleByName(String name){
        Optional<Vehicle> vehicleOptional = vehicles.stream()
                .filter(vehicle1 -> vehicle1.fuelType().equalsIgnoreCase(name)).findFirst();
        return vehicleOptional.orElse(null);
    }

    public void deleteVehicle(){

    }

    public void deleteVehicleByType(){

    }

    public void deleteVehicleByFuelType(){

    }

    public void deleteVehicleByAbsoluteFuelType(){

    }

    public void deleteVehicleByName(){

    }

    public void saveVehicles(){
        // w shall write to our json here
    }

}
