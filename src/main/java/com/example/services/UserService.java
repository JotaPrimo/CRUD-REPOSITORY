package com.example.services;

import com.example.models.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
    return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void upateUser(Long id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null) {
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setPassword(updatedUser.getPassword());
            userRepository.save(existingUser);
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
