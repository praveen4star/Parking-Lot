package controller;

import dtos.TicketRequestDto;
import dtos.TicketResponseDto;
import exceptions.InvalidRequestDataException;
import models.Ticket;
import models.constants.ResponseStatus;
import service.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController() {
        ticketService = new TicketService();
    }
    public TicketResponseDto generateTicket(TicketRequestDto ticketRequestDto) {
        try{
            if(ticketRequestDto.getGateId() == 0 || ticketRequestDto.getVehicleId() == 0 || ticketRequestDto.getEntryTime() == null || ticketRequestDto.getParkingSlotId() == 0){
                throw new InvalidRequestDataException("Invalid request data");
            }
            Ticket ticket = ticketService.getTicketForVehicle(ticketRequestDto.getVehicleId(), ticketRequestDto.getGateId(), ticketRequestDto.getEntryTime(), ticketRequestDto.getParkingSlotId());
            TicketResponseDto ticketResponseDto = new TicketResponseDto();
            ticketResponseDto.setStatus(ResponseStatus.SUCCESS);
            ticketResponseDto.setTicket(ticket);
            ticketResponseDto.setMessage("Ticket generated successfully");
            return ticketResponseDto;
        }
        catch (Exception e){
            TicketResponseDto ticketResponseDto = new TicketResponseDto();
            ticketResponseDto.setStatus(ResponseStatus.FAILURE);
            ticketResponseDto.setMessage(e.getMessage());
            return ticketResponseDto;
        }
    }
}
