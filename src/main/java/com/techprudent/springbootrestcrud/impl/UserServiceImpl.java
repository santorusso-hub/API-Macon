package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.model.User;
import com.techprudent.springbootrestcrud.repository.UserRepository;
import com.techprudent.springbootrestcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void delete(long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	public User create(User user) {
		return userRepository.save(user);
	}

    @Override
    public List<User> findByName(String name) {
		List<User>listUser=new ArrayList<User>();
		if(name!="null") {
			listUser=userRepository.findByNameContains(name);
		}
		if (name.equalsIgnoreCase("null")){
			listUser=userRepository.findAll();
		}
		return listUser;
    }

	@Override
	public User findById(long id) {
		return userRepository.findUserById(id);
	}

	@Override
	public User findByLoginAndPassword(String login, String password) {
		return userRepository.findUserByLoginAndPassword(login,password);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
