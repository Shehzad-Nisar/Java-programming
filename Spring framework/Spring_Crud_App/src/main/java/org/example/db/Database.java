package org.example.db;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Database {

    private  List<String> User;

    public void init(){
        System.out.println("db connection is established.");
    }

    public List<String> getUsers(){
        return User;
    }

    public void addUser(String user){
        User.add(user);
    }

    public void destroy(){
        System.out.println("db connection is closed.");
    }

}
