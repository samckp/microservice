package com.microservice.user.service;

import com.microservice.user.entity.User;
import com.microservice.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {

        return userRepository.save(user);
    }

    public List<User> getUsers() {

        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){

        return userRepository.findById(id);
    }
}
