package models.constants;

public interface FeeCalculationStrategy {
    public double calculateFee(long durationInMinutes);
}
