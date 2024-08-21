package com.techprudent.springbootrestcrud.controller;

import com.techprudent.springbootrestcrud.model.Payment;
import com.techprudent.springbootrestcrud.model.TypePayment;
import com.techprudent.springbootrestcrud.service.PaymentService;
import com.techprudent.springbootrestcrud.service.TypePaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/typePayment")
public class TypePaymentController {

	@Autowired
	private TypePaymentService typepaymentService;

	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findById(@PathVariable(value = "id")  long id) {
		return new ResponseEntity<>(typepaymentService.findById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/findByTypePayment/{typePayment}", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findByTypepayment(@PathVariable(value = "typePayment")  String typePayment) {
		return new ResponseEntity<>(typepaymentService.findByTypePayment(typePayment), HttpStatus.OK);
	}


	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> save(@RequestBody TypePayment typePayment) {
		return new ResponseEntity<>(typepaymentService.create(typePayment), HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> update(@RequestBody TypePayment typePayment) {
		return new ResponseEntity<>(typepaymentService.update(typePayment), HttpStatus.OK);
	}

	@RequestMapping(value ="/findAll", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> findAll() {
		return new ResponseEntity<>(typepaymentService.findAll(), HttpStatus.OK);
	}

	@RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		typepaymentService.delete(id);
	}


}
