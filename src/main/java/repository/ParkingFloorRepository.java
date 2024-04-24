package repository;

import exceptions.ParkingFloorNotFound;
import models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer, ParkingFloor> parkingFloorsMap;
    private static ParkingFloorRepository instance;
    public ParkingFloorRepository(){
        parkingFloorsMap = new HashMap<>();
    }
    public ParkingFloor getParkingFloor(int parkingFloorId) throws ParkingFloorNotFound {
        if(!parkingFloorsMap.containsKey(parkingFloorId)){
            throw new ParkingFloorNotFound("Parking Floor not found"+parkingFloorId);
        }
        return parkingFloorsMap.get(parkingFloorId);
    }
    public void putParkingFloor(ParkingFloor parkingFloor){
        parkingFloorsMap.put(parkingFloor.getId(), parkingFloor);
    }
    public static ParkingFloorRepository getInstance(){
        if(instance == null){
            instance = new ParkingFloorRepository();
        }
        return instance;
    }
}
