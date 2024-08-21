package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

       Client findClientById(Long id);

       List<Client> findByNameContains(String name);

}
