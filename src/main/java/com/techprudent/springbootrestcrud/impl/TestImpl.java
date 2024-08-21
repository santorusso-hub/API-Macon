package com.techprudent.springbootrestcrud.impl;

import com.techprudent.springbootrestcrud.model.Teste;
import com.techprudent.springbootrestcrud.repository.ClientRepository;
import com.techprudent.springbootrestcrud.repository.TestRepository;
import com.techprudent.springbootrestcrud.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public List<Teste> findAll() {
        List<Teste> listTest=testRepository.findAll();
        return listTest;
    }

    @Override
    public Teste create(Teste teste) {
        return testRepository.save(teste);
    }

    @Override
    public List<Teste> findByName(String name) {
        return testRepository.findByNomeContaining(name);
    }

    @Override
    public void delete(Long id) {
        testRepository.deleteById(id);
    }
}
