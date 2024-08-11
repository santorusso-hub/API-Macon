package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.model.User;
import com.techprudent.springbootrestcrud.repository.ClientRepository;
import com.techprudent.springbootrestcrud.repository.UserRepository;
import com.techprudent.springbootrestcrud.service.ClientService;
import com.techprudent.springbootrestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public void delete(long id) {
		clientRepository.deleteById(id);
	}

	@Override
	public Client update(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client create(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client findById(Long id) {
		return clientRepository.findClientById(id);
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

    @Override
    public List<Client> findByName(String name) {
		List<Client>listClient=new ArrayList<Client>();
		if (name!="null") {
			listClient= clientRepository.findByNameContains(name);
		}
		if (name.equalsIgnoreCase("null")){
			listClient= clientRepository.findAll();
		}
		return  listClient;
    }

	@Override
	public Iterable<Client> findAllList() {
		return clientRepository.findAll();
	}



}
