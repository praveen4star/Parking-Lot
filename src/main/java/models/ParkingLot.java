package models;

import strategy.feeCalculationStrategy.FeeCalculationStrategy;
import models.constants.ParkingLotStatus;
import strategy.slotAllocationStrategy.ParkingSlotAllocationStrategy;
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

    public ParkingLot(int id, String name, String address, ParkingLotStatus status, List<VehicleType> allowedVehicleTypes, ParkingSlotAllocationStrategy parkingSlotAllocationStrategy, FeeCalculationStrategy feeCalculationStrategy) {
        super.setId(id);
        this.name = name;
        this.address = address;
        this.status = status;
        this.allowedVehicleTypes = allowedVehicleTypes;
        this.parkingSlotAllocationStrategy = parkingSlotAllocationStrategy;
        this.feeCalculationStrategy = feeCalculationStrategy;
    }
    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public String getName() {
        return name;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public List<VehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public ParkingSlotAllocationStrategy getParkingSlotAllocationStrategy() {
        return parkingSlotAllocationStrategy;
    }

    public FeeCalculationStrategy getFeeCalculationStrategy() {
        return feeCalculationStrategy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public void setAllowedVehicleTypes(List<VehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public void setParkingSlotAllocationStrategy(ParkingSlotAllocationStrategy parkingSlotAllocationStrategy) {
        this.parkingSlotAllocationStrategy = parkingSlotAllocationStrategy;
    }

    public void setFeeCalculationStrategy(FeeCalculationStrategy feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }
}
