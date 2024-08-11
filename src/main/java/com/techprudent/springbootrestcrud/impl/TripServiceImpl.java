package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Trip;
import com.techprudent.springbootrestcrud.model.User;
import com.techprudent.springbootrestcrud.repository.TicketRepository;
import com.techprudent.springbootrestcrud.repository.TripRepository;
import com.techprudent.springbootrestcrud.repository.UserRepository;
import com.techprudent.springbootrestcrud.service.TripService;
import com.techprudent.springbootrestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImpl implements TripService {

	@Autowired
	private TripRepository triRepository;
	
	@Override
	public void delete(long id) {
		triRepository.deleteById(id);
	}

	@Override
	public Trip update(Trip trip) {
		return triRepository.save(trip);
	}

	@Override
	public Trip create(Trip trip) {
		return triRepository.save(trip);
	}

	@Override
	public Trip findById(long id) {
		return null;
	}

	@Override
	public List<Trip> findAll() {
		return triRepository.findAll();
	}

	@Override
	public void activeTrip(long id) {
		Trip trip= new Trip();
		trip= triRepository.findTripById(id);
		trip.getIdTicket().setStatus("Concluido");
		triRepository.save(trip);
	}

	@Override
	public void cancelTrip(long id) {
		Trip trip=new Trip();
		trip= triRepository.findTripById(id);
		trip.getIdTicket().setStatus("Cancelado");
		triRepository.save(trip);
	}

	@Override
	public List<Trip> findByNumberTickets(long id) {
		return triRepository.findByIdTicket_Id(id);
	}

	@Override
	public List<Trip> findByStatusActive() {
		return triRepository.findByIdTicket_Status("Activo");
	}

	@Override
	public List<Trip> findByStatusCancelado() {
		return triRepository.findByIdTicket_Status("Cancelado");
	}

	@Override
	public List<Trip> findByStatusCocluido() {
		return triRepository.findByIdTicket_Status("Concluido");
	}





}
