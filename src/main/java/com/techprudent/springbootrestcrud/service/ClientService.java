package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.model.User;

import java.util.List;

public interface ClientService {

	public void delete(long id) ;

	public Client update(Client client);

	public Client create(Client client) ;

	public Client findById(Long id) ;

	public List<Client> findAll();

	public List<Client> findByName(String name);

	public Iterable<Client> findAllList();

}
