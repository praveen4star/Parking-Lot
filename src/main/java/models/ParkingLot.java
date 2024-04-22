package models;

import service.strategy.feeCalculationStrategy.FeeCalculationStrategy;
import models.constants.ParkingLotStatus;
import service.strategy.slotAllocationStrategy.ParkingSlotAllocationStrategy;
import models.constants.VehicleType;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String name;
    private String address;
    private ParkingLotStatus status;
    private List<ParkingFloor> parkingFloors;
    private List<VehicleType> allowedVehicleTypes;
    private ParkingSlotAllocationStrategy parkingSlotAllocationStrategy;
    private FeeCalculationStrategy   feeCalculationStrategy;
}
