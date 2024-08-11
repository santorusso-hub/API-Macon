package com.techprudent.springbootrestcrud.controller;

import com.techprudent.springbootrestcrud.enums.HeaderRequest;
import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;

	private HeaderRequest headerRequest;

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findById(@PathVariable(value = "id")  Long id) {
		return new ResponseEntity<>(clientService.findById(id), HttpStatus.OK);
	}

    @RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> findByNameClient(@PathVariable(value = "name")  String name) {
        return new ResponseEntity<>(clientService.findByName(name), HttpStatus.OK);
    }


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> save(@RequestBody Client client) {
		return new ResponseEntity<>(clientService.create(client), HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> update(@RequestBody Client client) {
		return new ResponseEntity<>(clientService.update(client), HttpStatus.OK);
	}

	@RequestMapping(value ="/findAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findAll() {
		return new ResponseEntity<>(clientService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value ="/findAllList", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findAllList() {
		return new ResponseEntity<>(clientService.findAllList(), HttpStatus.OK);
	}

	@RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		clientService.delete(id);
	}






}
