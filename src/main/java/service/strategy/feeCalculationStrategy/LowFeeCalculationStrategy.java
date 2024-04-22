package service.strategy.feeCalculationStrategy;

import models.Ticket;
import models.constants.VehicleType;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LowFeeCalculationStrategy implements FeeCalculationStrategy {

    private int FIXED_FEE_2_WHEELER = 20;
    private int FIXED_FEE_4_WHEELER = 30;
    private double factor = 0.5;
    private int getMultiplier(VehicleType type) {
        return switch (type) {
            case FOUR_WHEELER -> FIXED_FEE_4_WHEELER;
            case TWO_WHEELER -> FIXED_FEE_2_WHEELER;
            default -> 0;
        };
    }
    @Override
    public double calculateFee(Ticket ticket, LocalDateTime exitTime) {
        long diffHours = ChronoUnit.HOURS.between(ticket.getEntryTime(), exitTime);
        double fixedFee = diffHours*getMultiplier(ticket.getVehicle().getType());
        return fixedFee + (fixedFee*(factor*(diffHours-1)));
    }

}
