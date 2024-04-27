package dtos;

import java.time.LocalDateTime;

public class BillRequestDto {
    private int ticketId;
    private int parkingLotId;
    private LocalDateTime exitTime;
    private int gateId;

    public int getTicketId() {
        return ticketId;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public int getGateId() {
        return gateId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }
}
