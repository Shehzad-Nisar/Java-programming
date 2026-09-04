package org.example.service;

import org.example.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private Repository repository;

    public UserService(Repository repository) {
        this.repository = repository;
    }

    public void addUser(String name){
        repository.save(name);
    }

    public List<String> getAllUsers(){
        return repository.findAll();
    }
}
