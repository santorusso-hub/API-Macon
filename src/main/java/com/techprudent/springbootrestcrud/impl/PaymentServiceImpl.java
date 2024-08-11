package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Payment;
import com.techprudent.springbootrestcrud.repository.PaymentRepository;
import com.techprudent.springbootrestcrud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public void delete(long id) {
		paymentRepository.deleteById(id);
	}

	@Override
	public Payment update(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public Payment create(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public Payment findById(long id) {
		return paymentRepository.findEventoById(id);
	}

	@Override
	public List<Payment> findAll() {
		return paymentRepository.getAllPayment();
	}

}
