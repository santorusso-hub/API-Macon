package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Tickets;
import com.techprudent.springbootrestcrud.model.User;

import java.util.List;

public interface TicketService {

	public void delete(long id) ;

	public Tickets update(Tickets user);

	public Tickets create(Tickets user,long route,long client,long typePayment) ;

	public Tickets findById(long id) ;

	public Tickets findTicketsByIdRoute(Long id) ;

	public Tickets findByRangeCity(String cityArrival,String departureCity) ;

	public List<Tickets> findAll();

	public List<Tickets> findLastNumberTickets();

	public  List<Tickets> findByTickets(String nome);

}
