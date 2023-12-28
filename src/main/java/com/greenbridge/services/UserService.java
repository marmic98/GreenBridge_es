package com.greenbridge.services;

import com.greenbridge.entities.User;
import com.greenbridge.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
    public List<User> getAllUsers () {
        return userRepository.findAll();
    }

    public boolean userExistsByMail(User user){
        return userRepository.existsByEmail(user.getEmail());
    }
}

