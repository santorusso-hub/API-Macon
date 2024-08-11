package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Payment;
import com.techprudent.springbootrestcrud.model.TypePayment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypePaymentRepository extends JpaRepository<TypePayment, Long> {

       TypePayment findTypePaymentById(long id);

       List<TypePayment> findByTypePaymentContains(String typePayment);
}
