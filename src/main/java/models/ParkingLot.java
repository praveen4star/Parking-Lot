package models;

import java.util.List;

public class ParkingLot {
    private String name;
    private Address address;
    private ParkingLotStatus status;
    private List<ParkingFloor> parkingFloors;
    private List<VehicleType> allowedVehicleTypes;
    private List<ParkingSlotAllocationStrategy> parkingSlotAllocationStrategies;
    private List<FeeCalculationStrategy>    feeCalculationStrategies;
}
