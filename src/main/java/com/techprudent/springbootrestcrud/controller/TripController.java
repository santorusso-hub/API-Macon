package com.techprudent.springbootrestcrud.controller;

import com.techprudent.springbootrestcrud.model.Trip;
import com.techprudent.springbootrestcrud.model.User;
import com.techprudent.springbootrestcrud.service.TripService;
import com.techprudent.springbootrestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trip")
public class TripController {

	@Autowired
	private TripService tripService;

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findById(@PathVariable(value = "id")  Long id) {
		return new ResponseEntity<>(tripService.findById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/findByNumberTickets/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findByNumberTickets(@PathVariable(value = "id")  long id) {
		return new ResponseEntity<>(tripService.findByNumberTickets(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/findByStatusActive", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findByStatusActive() {
		return new ResponseEntity<>(tripService.findByStatusActive(), HttpStatus.OK);
	}

	@RequestMapping(value = "/findByStatusCancelado", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findByStatusCancelado() {
		return new ResponseEntity<>(tripService.findByStatusCancelado(), HttpStatus.OK);
	}

	@RequestMapping(value = "/findByStatusCocluido", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findByStatusCocluido() {
		return new ResponseEntity<>(tripService.findByStatusCocluido(), HttpStatus.OK);
	}


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> save(@RequestBody Trip trip) {
		return new ResponseEntity<>(tripService.create(trip), HttpStatus.OK);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> update(@RequestBody Trip trip) {
		return new ResponseEntity<>(tripService.update(trip), HttpStatus.OK);
	}

	@RequestMapping(value ="/findAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findAll() {
		return new ResponseEntity<>(tripService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		tripService.delete(id);
	}

	@RequestMapping(value ="/activeTrip/{id}", method = RequestMethod.DELETE)
	public void activeTrip(@PathVariable long id) {
		tripService.activeTrip(id);
	}

	@RequestMapping(value ="/cancelTrip/{id}", method = RequestMethod.DELETE)
	public void cancelTrip(@PathVariable long id) {
		tripService.cancelTrip(id);
	}





}
