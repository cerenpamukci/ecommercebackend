package org.example.service;

import org.example.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(Long id);
    List<User> getAllUsers();
    User createUser(User user);
    void deleteUser(Long id);
}