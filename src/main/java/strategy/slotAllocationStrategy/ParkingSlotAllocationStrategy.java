package strategy.slotAllocationStrategy;

import exceptions.ParkingSlotNotUnavailable;
import models.Gate;
import models.ParkingLot;
import models.ParkingSlot;
import models.Vehicle;

public interface ParkingSlotAllocationStrategy {
    public ParkingSlot getParkingSlot(Vehicle vehicle, ParkingLot parkingLot, Gate entryGate) throws ParkingSlotNotUnavailable;
}
