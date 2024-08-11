package com.techprudent.springbootrestcrud.repository;

import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(long id);

    User findUserByLoginAndPassword(String login, String password);

    List<User> findByNameContains(String name);
}
