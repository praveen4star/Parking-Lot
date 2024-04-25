package dtos;

import java.time.LocalDateTime;

public class TicketRequestDto {
    private int vehicleId;
    private int gateId;
    private LocalDateTime entryTime;
    private int parkingSlotId;

    public int getVehicleId() {
        return vehicleId;
    }

    public int getGateId() {
        return gateId;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public int getParkingSlotId() {
        return parkingSlotId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public void setParkingSlotId(int parkingSlotId) {
        this.parkingSlotId = parkingSlotId;
    }
}
