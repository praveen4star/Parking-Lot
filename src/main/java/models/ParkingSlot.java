package models;

import models.constants.ParkingSlotStatus;
import models.constants.VehicleType;

public class ParkingSlot extends BaseModel {
    private int slotNumber;
    private VehicleType vehicleType;
    private Vehicle vehicle;
    private ParkingSlotStatus status;
}
