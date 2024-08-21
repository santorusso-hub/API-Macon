package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Payment;
import com.techprudent.springbootrestcrud.model.TypePayment;

import java.util.List;

public interface TypePaymentService {

	public void delete(long id) ;

	public TypePayment update(TypePayment typePayment);

	public TypePayment create(TypePayment typePayment) ;

	public TypePayment findById(long id) ;

	public List<TypePayment> findAll();

	public List<TypePayment> findByTypePayment(String typePayment);


}
