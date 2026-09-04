package org.example.repository;

import org.example.db.Database;

import java.util.List;

public class Repository {
    private Database db;

    public Repository(Database db) {
        this.db = db;
    }

    public void save(String user){
        db.addUser(user);
    }

    public List<String> findAll(){
        return db.getUsers();
    }


}
