package service.strategy.slotAllocationStrategy;

import models.Gate;
import models.ParkingLot;
import models.ParkingSlot;
import models.Vehicle;

public interface ParkingSlotAllocationStrategy {
    public ParkingSlot getParkingSlot(Vehicle vehicle, ParkingLot parkingLot, Gate entryGate);
}
