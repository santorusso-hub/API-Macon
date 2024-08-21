package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Payment;
import com.techprudent.springbootrestcrud.model.User;

import java.util.List;

public interface PaymentService {

	public void delete(long id) ;

	public Payment update(Payment payment);

	public Payment create(Payment payment) ;

	public Payment findById(long id) ;

	public List<Payment> findAll();

}
