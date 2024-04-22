package models.constants;

import models.ParkingSlot;
import models.Vehicle;

public interface ParkingSlotAllocationStrategy {
    public ParkingSlot getParkingSlot(Vehicle vehicle);
}
