package repository;

import exceptions.ParkingFloorNotFound;
import models.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepository {
    private Map<Integer, ParkingFloor> parkingFloorsMap;
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
}
