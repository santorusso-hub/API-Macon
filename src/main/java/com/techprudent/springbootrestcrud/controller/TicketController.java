package com.techprudent.springbootrestcrud.controller;

import com.techprudent.springbootrestcrud.model.Tickets;
import com.techprudent.springbootrestcrud.model.User;
import com.techprudent.springbootrestcrud.service.TicketService;
import com.techprudent.springbootrestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findById(@PathVariable(value = "id")  Long id) {
		return new ResponseEntity<>(ticketService.findById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/findTicketsByIdRoute/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findTicketsByIdRoute(@PathVariable(value = "id")  Long id) {
		return new ResponseEntity<>(ticketService.findTicketsByIdRoute(id), HttpStatus.OK);
	}


	@RequestMapping(value = "/findByRangeCity/{cityArrival}/{departureCity}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findByRangeCity(@PathVariable(value = "cityArrival")  String cityArrival, @PathVariable(value = "departureCity")  String departureCity) {
		return new ResponseEntity<>(ticketService.findByRangeCity(cityArrival,departureCity), HttpStatus.OK);
	}

	@RequestMapping(value = "/findByTickets/{nome}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findByTickets(@PathVariable(value = "nome")  String nome) {
		return new ResponseEntity<>(ticketService.findByTickets(nome), HttpStatus.OK);
	}

	@RequestMapping(value = "/create/{route}/{client}/{typePayment}", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> save(@RequestBody Tickets tickets,@PathVariable(value = "route")  long route,@PathVariable(value = "client")  long client,@PathVariable(value = "typePayment")  long typePayment) {
		return new ResponseEntity<>(ticketService.create(tickets,route,client,typePayment), HttpStatus.OK);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> update(@RequestBody Tickets tickets) {
		return new ResponseEntity<>(ticketService.update(tickets), HttpStatus.OK);
	}

	@RequestMapping(value ="/findAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findAll() {
		return new ResponseEntity<>(ticketService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value ="/findLastNumberTickets", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findLastNumberTickets() {
		return new ResponseEntity<>(ticketService.findLastNumberTickets(), HttpStatus.OK);
	}

	@RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		ticketService.delete(id);
	}


}
