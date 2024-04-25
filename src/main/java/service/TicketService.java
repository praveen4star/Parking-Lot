package service;

import exceptions.GateNotFound;
import exceptions.ParkingSlotNotFound;
import exceptions.VehicleNotFound;
import models.Gate;
import models.ParkingSlot;
import models.Ticket;
import models.Vehicle;
import models.constants.ParkingSlotStatus;
import repository.GateRepository;
import repository.ParkingSlotRepository;
import repository.TicketRepository;
import repository.VehicleRepository;

import java.time.LocalDateTime;

public class TicketService {
    private TicketRepository ticketRepository;
    private VehicleRepository vehicleRepository;
    private GateRepository gateRepository;
    private ParkingSlotRepository parkingSlotRepository;
    public TicketService(){
        ticketRepository = TicketRepository.getInstance();
        vehicleRepository = VehicleRepository.getInstance();
        gateRepository = GateRepository.getInstance();
        parkingSlotRepository = ParkingSlotRepository.getInstance();
    }
    public Ticket getTicketForVehicle(int vehicleId, int gateId, LocalDateTime entryTime, int parkingSlotId) throws VehicleNotFound, GateNotFound, ParkingSlotNotFound {
        Vehicle vehicle = vehicleRepository.getVehicle(vehicleId);
        Gate entryGate = gateRepository.getGate(gateId);
        ParkingSlot parkingSlot = parkingSlotRepository.getParkingSlot(parkingSlotId);
        parkingSlot.setVehicle(vehicle);
        parkingSlot.setStatus(ParkingSlotStatus.OCCUPIED);
        Ticket ticket = new Ticket(entryGate, entryTime, vehicle, parkingSlot);
        ticketRepository.put(ticket);
        return ticket;
    }
}
