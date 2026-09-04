package org.example.controller;

import org.example.service.UserService;
import java.util.List;


public class Controller {
    private UserService userService;


    public Controller(UserService userService) {
        this.userService = userService;
    }

    public void createUser(String name){
        userService.addUser( name);
        System.out.println("created user as :" + name);
    }

    public void allUser(){
        List<String> users = userService.getAllUsers();
        System.out.println(users);
    }
}
