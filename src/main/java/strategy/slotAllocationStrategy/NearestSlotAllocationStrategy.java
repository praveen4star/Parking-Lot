package strategy.slotAllocationStrategy;

import exceptions.ParkingSlotNotUnavailable;
import models.*;
import models.constants.ParkingSlotStatus;

import java.util.List;

public class NearestSlotAllocationStrategy implements ParkingSlotAllocationStrategy{
    public NearestSlotAllocationStrategy() {
        System.out.println("NearestSlotAllocationStrategy");
    }
    @Override
    public ParkingSlot getParkingSlot(Vehicle vehicle, ParkingLot parkingLot, Gate entryGate) throws ParkingSlotNotUnavailable {
        List<ParkingFloor> parkingFloors = parkingLot.getParkingFloors();
        ParkingFloor nearestParkingFloor = parkingFloors.get(entryGate.getParkingFloorNumber());
        for(ParkingSlot parkingSlot : nearestParkingFloor.getParkingSlots()){
            if(parkingSlot.getStatus().equals(ParkingSlotStatus.FREE) && parkingSlot.getVehicleType().equals(vehicle.getType())){
                return parkingSlot;
            }
        }
        int i = entryGate.getParkingFloorNumber()-1;
        int j = entryGate.getParkingFloorNumber()+1;
        while(i >= 0 || j < parkingFloors.size()){
            if(i >= 0){
                ParkingFloor parkingFloor = parkingFloors.get(i);
                for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()){
                    if(parkingSlot.getStatus().equals(ParkingSlotStatus.FREE) && parkingSlot.getVehicleType().equals(vehicle.getType())){
                        return parkingSlot;
                    }
                }
                i--;
            }
            if(j < parkingFloors.size()){
                ParkingFloor parkingFloor = parkingFloors.get(j);
                for(ParkingSlot parkingSlot : parkingFloor.getParkingSlots()){
                    if(parkingSlot.getStatus().equals(ParkingSlotStatus.FREE) && parkingSlot.getVehicleType().equals(vehicle.getType())){
                        return parkingSlot;
                    }
                }
                j++;
            }
        }
        throw new ParkingSlotNotUnavailable("Parking slot not available for vehicle type : "+vehicle.getType( ) +" in parkingLot :"+ parkingLot.getName());
    }
}
