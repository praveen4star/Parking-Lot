import exceptions.GateNotFound;
import exceptions.ParkingSlotNotUnavailable;
import models.Gate;
import models.ParkingLot;
import models.ParkingSlot;
import models.Vehicle;
import models.constants.VehicleType;
import repository.GateRepository;
import service.InitializeService;

public class ParkingLotApplication {
    public static void main(String[] args) throws GateNotFound, ParkingSlotNotUnavailable {
        InitializeService initializeService = new InitializeService();
        ParkingLot parkingLot = initializeService.initializeParkingLot();
        Vehicle vehicle = new Vehicle(1, "KA-01-HH-1234", "White", "Toyota", VehicleType.FOUR_WHEELER);
        Gate gate = GateRepository.getInstance().getGate(111);
        ParkingSlot parkingSlot = parkingLot.getParkingSlotAllocationStrategy().getParkingSlot(vehicle, parkingLot, gate);
        System.out.println("Allocated Parking Slot: " + parkingSlot.getId());
        System.out.println(parkingSlot.getSlotNumber()+" "+parkingSlot.getVehicleType()+" "+parkingSlot.getStatus());
    }
}
