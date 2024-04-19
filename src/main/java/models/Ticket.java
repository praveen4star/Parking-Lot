package models;

import java.util.Date;

public class Ticket {
    private Gate entryGate;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private TicketStatus status;
}
