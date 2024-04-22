package service.strategy.feeCalculationStrategy;

import models.Ticket;

public interface FeeCalculationStrategy {
    public double calculateFee(Ticket ticket, long durationInMinutes);
}
