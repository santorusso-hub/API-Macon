package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.*;
import com.techprudent.springbootrestcrud.repository.TicketRepository;
import com.techprudent.springbootrestcrud.repository.TripRepository;
import com.techprudent.springbootrestcrud.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	@Autowired
	private TripRepository tripRepository;
	
	@Override
	public void delete(long id) {
		ticketRepository.deleteTicketsById(id);
	}

	@Override
	public Tickets update(Tickets tickets) {
		return ticketRepository.save(tickets);
	}

	@Override
	public Tickets create(Tickets tickets,long route,long client,long typePayment) {
		Route rota=new Route();
		Client cliente=new Client();
		TypePayment tipoPagamento=new TypePayment();

		rota.setId(route);
		cliente.setId(client);
		tipoPagamento.setId(typePayment);

		tickets.setIdRoute(rota);
		tickets.setIdClient(cliente);
		tickets.setIdTypePayment(tipoPagamento);
		Tickets saveTickets=ticketRepository.save(tickets);
		assignTravelValues(tickets);

		return saveTickets;
	}

	public void assignTravelValues(Tickets tickets){
		Trip trip=new Trip();

		trip.setIdTicket(tickets);
		ticketRepository.findById(tickets.getId());
		//trip.setPriceTotal();
		tripRepository.save(trip);
	}

	@Override
	public Tickets findById(long id) {
		return null;
	}

    @Override
    public Tickets findTicketsByIdRoute(Long id) {
        return ticketRepository.findByIdRoute_Id(id);
    }

    @Override
	public Tickets findByRangeCity(String cityArrival, String departureCity) {
		return ticketRepository.getRangeCity(cityArrival,departureCity);
	}

	@Override
	public List<Tickets> findAll() {
		return ticketRepository.getAllTickets();
	}

	@Override
	public List<Tickets> findLastNumberTickets() {
		return ticketRepository.findLastNumberTickets();
	}

	@Override
	public List<Tickets> findByTickets(String nome) {
		List<Tickets>listTickets=new ArrayList<Tickets>();
		if (nome!="null") {
			listTickets= ticketRepository.findByIdClient_NameContains(nome);
		}
		if (nome.equalsIgnoreCase("null")){
			listTickets= ticketRepository.findAll();
		}
		return listTickets;
	}
}
