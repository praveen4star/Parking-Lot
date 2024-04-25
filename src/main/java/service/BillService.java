package service;

import exceptions.GateNotFound;
import exceptions.TicketNotFound;
import models.Bill;
import models.Gate;
import models.ParkingLot;
import models.Ticket;
import repository.BillRepository;
import repository.GateRepository;
import repository.ParkingLotRepository;
import repository.TicketRepository;

import java.time.LocalDateTime;

public class BillService {
    private TicketRepository ticketRepository;
    private BillRepository billRepository;
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    public BillService() {
        ticketRepository = TicketRepository.getInstance();
        billRepository = BillRepository.getInstance();
        parkingLotRepository = ParkingLotRepository.getInstance();
        gateRepository = GateRepository.getInstance();
    }
    public Bill generateBill(int ticketId, int parkingLotId, LocalDateTime exitTime, int gateId) throws TicketNotFound, GateNotFound {
        Ticket ticket = ticketRepository.get(ticketId);
        ParkingLot parkingLot = parkingLotRepository.getParkingLot(parkingLotId);
        double amount = parkingLot.getFeeCalculationStrategy().calculateFee(ticket, exitTime);
        Gate exitGate = gateRepository.getGate(gateId);
        return  new Bill(1, ticket, amount, exitTime, exitGate);

    }
}
