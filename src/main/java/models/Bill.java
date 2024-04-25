package models;

import java.time.LocalDateTime;
import java.util.Date;

public class Bill extends BaseModel {
    private Ticket ticket;
    private double amount;
    private LocalDateTime exitTime;
    private Gate exitGate;
    public Bill(int billId, Ticket ticket, double amount, LocalDateTime exitTime, Gate exitGate) {
        super.setId(billId);
        this.ticket = ticket;
        this.amount = amount;
        this.exitTime = exitTime;
        this.exitGate = exitGate;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public Gate getExitGate() {
        return exitGate;
    }
}
