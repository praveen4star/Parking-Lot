package service;

import models.Gate;
import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSlot;
import models.constants.*;
import repository.GateRepository;
import repository.ParkingFloorRepository;
import repository.ParkingLotRepository;
import repository.ParkingSlotRepository;
import strategy.feeCalculationStrategy.FeeCalculationStrategyFactory;
import strategy.slotAllocationStrategy.ParkingSlotAllocationStrategyFactory;
import strategy.slotAllocationStrategy.ParkingSlotAllocationStrategyType;

import java.util.ArrayList;
import java.util.List;

public class InitializeService {
    private GateRepository gateRepository;
    private ParkingSlotRepository parkingSlotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private ParkingLotRepository parkingLotRepository;
    public InitializeService() {
        gateRepository = GateRepository.getInstance();
        parkingSlotRepository = ParkingSlotRepository.getInstance();
        parkingFloorRepository = ParkingFloorRepository.getInstance();
        parkingLotRepository = ParkingLotRepository.getInstance();

    }
    public ParkingLot initializeParkingLot() {
        ParkingLot parkingLot = new ParkingLot(
                    1, "Parking Lot 1", "Address : 1",
                    ParkingLotStatus.OPEN,
                    List.of(VehicleType.FOUR_WHEELER, VehicleType.TWO_WHEELER),
                    ParkingSlotAllocationStrategyFactory.getParkingSlotAllocationStrategy(ParkingSlotAllocationStrategyType.NEAREST_SLOT_ALLOCATION_STRATEGY),
                    FeeCalculationStrategyFactory.getFeeCalculationStrategy()
                );
        List<ParkingFloor> parkingFloors = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            /* parking floor initialization */
            ParkingFloor parkingFloor = new ParkingFloor(10+i, i, ParkingFloorStatus.OPEN);
            /* List of parking gates */
            List<Gate> gates = new ArrayList<>();
            Gate entryGate = new Gate(parkingFloor.getId()*10+1, GateType.ENTRY, "Ram", GateStatus.OPEN, parkingFloor.getFloorNumber());
            Gate exitGate = new Gate(parkingFloor.getId()*10+2, GateType.EXIT, "Shyam", GateStatus.OPEN, parkingFloor.getFloorNumber());
            gateRepository.putGate(entryGate);
            gateRepository.putGate(exitGate);
            gates.add(entryGate);
            gates.add(exitGate);
            parkingFloor.setGates(gates);
            /* List of parkingSlot */
            List<ParkingSlot> parkingSlots = new ArrayList<>();
            for(int j = 0; j<10; j++){
                ParkingSlot  parkingSlot = new ParkingSlot(
                                parkingFloor.getId()*100+j,
                                    j%3 == 0 ? VehicleType.TWO_WHEELER : j%3 ==1 ? VehicleType.FOUR_WHEELER : VehicleType.THREE_WHEELER,
                            parkingFloor.getId()*100+j,
                                        ParkingSlotStatus.FREE
                                );
                parkingSlotRepository.putParkingSlot(parkingSlot);
                parkingSlots.add(parkingSlot);
            }
            parkingFloor.setParkingSlots(parkingSlots);
            /* saving parking floor */
            parkingFloors.add(parkingFloor);
            parkingFloorRepository.putParkingFloor(parkingFloor);
        }
        parkingLot.setParkingFloors(parkingFloors);
        System.out.println("Parking Lot initialized");
        parkingLotRepository.addParkingLot(parkingLot);
        return parkingLot;
    }
}
