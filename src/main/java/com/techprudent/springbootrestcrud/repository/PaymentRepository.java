package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
        Payment findEventoById(Long id);

        @Query(value = "SELECT * FROM payment  as p INNER JOIN type_payment  as t " +
                       " ON p.id_payment=t.id_type_payment;", nativeQuery = true)
        List<Payment> getAllPayment();


}
