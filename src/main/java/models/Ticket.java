package models;

import models.constants.TicketStatus;

import java.time.LocalDateTime;
import java.util.Date;


public class Ticket extends BaseModel {
    private Gate entryGate;
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private TicketStatus status;

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
