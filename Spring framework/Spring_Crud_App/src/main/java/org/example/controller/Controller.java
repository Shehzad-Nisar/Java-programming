package org.example.controller;

import org.example.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;
@Service


public class Controller {
    private UserService userService;

    public Controller(UserService userService) {
        this.userService = userService;
    }

    public void createUser(String name){
        userService.addUser( name);
    }

    public void allUser(){
        List<String> users = userService.getAllUsers();
        System.out.println(users);
    }
}
