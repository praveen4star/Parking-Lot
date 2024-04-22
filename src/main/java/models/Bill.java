package models;

import java.util.Date;

public class Bill extends BaseModel {
    private Ticket ticket;
    private double amount;
    private Date exitTime;
    private Gate exitGate;
}
