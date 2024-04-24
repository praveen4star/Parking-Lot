package models;

import models.constants.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int floorNumber;
    private List<Gate> gates;
    private List<ParkingSlot> parkingSlots;
    private ParkingFloorStatus status;
    public ParkingFloor(int id, int floorNumber, ParkingFloorStatus status){
        super.setId(id);
        this.floorNumber = floorNumber;
        this.status = status;
    }
    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public ParkingFloorStatus getStatus() {
        return status;
    }
}
