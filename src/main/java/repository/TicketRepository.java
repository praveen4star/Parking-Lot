package repository;

import exceptions.TicketNotFound;
import models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> ticketMap;
    private static  TicketRepository instance;
    private TicketRepository(){
        ticketMap = new HashMap<>();
    }

    public static TicketRepository getInstance() {
        if(instance == null){
            instance = new TicketRepository();
        }
        return instance;
    }
    public Ticket get(int ticketId) throws TicketNotFound {
        if(!ticketMap.containsKey(ticketId)){
            throw new TicketNotFound("Ticket not found for this ticketId : "+ticketId);
        }
        return ticketMap.get(ticketId);
    }
    public void put(Ticket ticket){
        ticketMap.put(ticket.getId(), ticket);
    }
}
