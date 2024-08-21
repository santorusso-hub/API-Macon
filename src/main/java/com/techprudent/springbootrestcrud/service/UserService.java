package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.User;

import java.util.List;

public interface UserService {

	public void delete(long id) ;

	public User update(User user);

	public User create(User user) ;

	public User findById(long id) ;

	public List<User> findAll();

    public  List<User>findByName(String name);

	public  User findByLoginAndPassword(String login,String password);

}
