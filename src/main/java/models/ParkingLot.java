package models;

import models.constants.FeeCalculationStrategy;
import models.constants.ParkingLotStatus;
import models.constants.ParkingSlotAllocationStrategy;
import models.constants.VehicleType;

import java.util.List;

public class ParkingLot extends BaseModel {
    private String name;
    private Address address;
    private ParkingLotStatus status;
    private List<ParkingFloor> parkingFloors;
    private List<VehicleType> allowedVehicleTypes;
    private List<ParkingSlotAllocationStrategy> parkingSlotAllocationStrategies;
    private List<FeeCalculationStrategy>    feeCalculationStrategies;
}
