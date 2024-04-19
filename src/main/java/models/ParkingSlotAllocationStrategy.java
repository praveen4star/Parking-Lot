package models;

public interface ParkingSlotAllocationStrategy {
    public ParkingSlot getParkingSlot(Vehicle vehicle);
}
