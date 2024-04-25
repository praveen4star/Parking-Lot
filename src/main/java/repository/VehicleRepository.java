package repository;

import exceptions.VehicleNotFound;
import models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    private Map<Integer, Vehicle> vehicleMap;
    private static VehicleRepository instance;
    private VehicleRepository(){
        vehicleMap = new HashMap<>();
    }
    public Vehicle getVehicle(int vehicleId) throws VehicleNotFound {
        if(!vehicleMap.containsKey(vehicleId)){
            throw new VehicleNotFound("Vehicle not found : "+vehicleId);
        }
        return vehicleMap.get(vehicleId);
    }
    public void put(Vehicle vehicle){
        vehicleMap.put(vehicle.getId(), vehicle);
    }
    public static VehicleRepository getInstance(){
        if(instance == null){
            instance = new VehicleRepository();
        }
        return instance;
    }
}
