package repository;

import exceptions.VehicleNotFound;
import models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    private Map<Integer, Vehicle> vehicleMap;
    public VehicleRepository(){
        vehicleMap = new HashMap<>();
    }
    public Vehicle getVehicle(int vehicleId) throws VehicleNotFound {
        if(!vehicleMap.containsKey(vehicleId)){
            throw new VehicleNotFound("Vehicle not found : "+vehicleId);
        }
        return vehicleMap.get(vehicleId);
    }
}
