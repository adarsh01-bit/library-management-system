package com.librarymanagement.service;

import com.librarymanagement.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;


    public UserService() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added successfully.");
    }

    public void listUsers() {
        if (users.isEmpty()) {
            System.out.println(" No users found.");
        } else {
            System.out.println(" Registered Users:");
            users.forEach(System.out::println);
        }
    }
}