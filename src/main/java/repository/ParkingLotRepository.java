package repository;

import models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLots;
    private static ParkingLotRepository instance;
    public ParkingLotRepository(){
        parkingLots = new HashMap<>();
    }
    public ParkingLot getParkingLot(int parkingLotId){
        return parkingLots.get(parkingLotId);
    }
    public void addParkingLot(ParkingLot parkingLot){
        parkingLots.put(parkingLot.getId(), parkingLot);
    }
    public static ParkingLotRepository getInstance(){
        if(instance == null){
            instance = new ParkingLotRepository();
        }
        return instance;
    }
}
