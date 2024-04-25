import controller.TicketController;
import dtos.TicketRequestDto;
import dtos.TicketResponseDto;
import exceptions.GateNotFound;
import exceptions.ParkingSlotNotUnavailable;
import models.Gate;
import models.ParkingLot;
import models.ParkingSlot;
import models.Vehicle;
import models.constants.ResponseStatus;
import models.constants.VehicleType;
import repository.GateRepository;
import service.InitializeService;

import java.time.LocalDateTime;

public class ParkingLotApplication {
    public static void main(String[] args) throws GateNotFound, ParkingSlotNotUnavailable {
        InitializeService initializeService = new InitializeService();
        ParkingLot parkingLot = initializeService.initializeParkingLot();
        Vehicle vehicle = initializeService.getVehicle();
        Gate gate = GateRepository.getInstance().getGate(111);
        ParkingSlot parkingSlot = parkingLot.getParkingSlotAllocationStrategy().getParkingSlot(vehicle, parkingLot, gate);
        TicketController ticketController = new TicketController();
        TicketRequestDto ticketRequestDto = new TicketRequestDto();

        ticketRequestDto.setVehicleId(vehicle.getId());
        ticketRequestDto.setGateId(gate.getId());
        ticketRequestDto.setEntryTime(LocalDateTime.now());
        ticketRequestDto.setParkingSlotId(parkingSlot.getId());

        TicketResponseDto ticketResponseDto = ticketController.generateTicket(ticketRequestDto);
        if(ticketResponseDto.getStatus().equals(ResponseStatus.FAILURE)){
            System.out.println("Ticket generation failed : "+ticketResponseDto.getMessage());

        }
        else{
            System.out.println("Ticket generated successfully : "+ticketResponseDto.getTicket().getId());
        }

    }
}
