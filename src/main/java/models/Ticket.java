package models;

import models.constants.TicketStatus;

import java.util.Date;

public class Ticket extends BaseModel {
    private Gate entryGate;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private TicketStatus status;
}
