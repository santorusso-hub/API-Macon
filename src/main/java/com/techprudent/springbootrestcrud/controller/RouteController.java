package com.techprudent.springbootrestcrud.controller;

import com.techprudent.springbootrestcrud.model.Route;
import com.techprudent.springbootrestcrud.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/route")
public class RouteController {

	@Autowired
	private RouteService routeService;

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findById(@PathVariable(value = "id")  long id) {
		return new ResponseEntity<>(routeService.findById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/findByPartidaAndChegada/{partida}/{chegada}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findByDepartureCityAndCityArrival(@PathVariable(value = "partida")  String partida, @PathVariable(value = "chegada")  String chegada) {
		return new ResponseEntity<>(routeService.findByDepartureCityAndCityArrival(partida,chegada), HttpStatus.OK);
	}


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> save(@RequestBody Route route) {
		return new ResponseEntity<>(routeService.create(route), HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> update(@RequestBody Route route) {
		return new ResponseEntity<>(routeService.update(route), HttpStatus.OK);
	}

	@RequestMapping(value ="/findAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findAll() {
		return new ResponseEntity<>(routeService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		routeService.delete(id);
	}


}
