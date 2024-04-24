package repository;

import exceptions.ParkingSlotNotFound;
import models.ParkingSlot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSlotRepository {
    private Map<Integer, ParkingSlot> parkingSlotMap;
    private static ParkingSlotRepository instance;
    public ParkingSlotRepository(){
        parkingSlotMap = new HashMap<>();

    }
    public ParkingSlot getParkingSlot(int parkingSlotId) throws ParkingSlotNotFound {
        if(!parkingSlotMap.containsKey(parkingSlotId)){
            throw new ParkingSlotNotFound("Parking slot not found : "+parkingSlotId);
        }
        return parkingSlotMap.get(parkingSlotId);
    }
    public void putParkingSlot(ParkingSlot parkingSlot){
        parkingSlotMap.put(parkingSlot.getId(), parkingSlot);
    }

    public static ParkingSlotRepository getInstance(){
        if(instance == null){
            instance = new ParkingSlotRepository();
        }
        return instance;
    }

}
