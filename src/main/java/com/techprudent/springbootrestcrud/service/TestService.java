package com.techprudent.springbootrestcrud.service;

import com.techprudent.springbootrestcrud.model.Client;
import com.techprudent.springbootrestcrud.model.Teste;

import java.util.List;

public interface TestService {

    public List<Teste> findAll();

    public Teste create(Teste teste);

    public List<Teste> findByName(String name);

    void delete(Long id);
}
