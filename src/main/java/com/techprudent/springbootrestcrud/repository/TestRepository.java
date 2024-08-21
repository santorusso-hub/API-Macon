package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.model.Teste;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TestRepository extends JpaRepository<Teste, Long> {
    List<Teste> findByNomeContaining(String nome);
}
