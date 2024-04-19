package models;

public interface FeeCalculationStrategy {
    public double calculateFee(long durationInMinutes);
}
