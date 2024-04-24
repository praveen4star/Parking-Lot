package models;

import models.constants.ParkingSlotStatus;
import models.constants.VehicleType;

public class ParkingSlot extends BaseModel {
    private int slotNumber;
    private VehicleType vehicleType;
    private Vehicle vehicle;
    private ParkingSlotStatus status;

    public int getSlotNumber() {
        return slotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public ParkingSlotStatus getStatus() {
        return status;
    }
}
