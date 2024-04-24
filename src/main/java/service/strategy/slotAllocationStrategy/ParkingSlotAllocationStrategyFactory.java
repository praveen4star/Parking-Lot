package service.strategy.slotAllocationStrategy;

public class ParkingSlotAllocationStrategyFactory {
    public static ParkingSlotAllocationStrategy getParkingSlotAllocationStrategy(String strategyType){
        if(strategyType.equals(ParkingSlotAllocationStrategyType.NEAREST_SLOT_ALLOCATION_STRATEGY)){
            return new NearestSlotAllocationStrategy();
        }
        return new NearestSlotAllocationStrategy();
    }
}
