package com.greenbridge.controllers;

import com.greenbridge.entities.User;
import com.greenbridge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class RestNotaController {

    @Autowired
    private UserService userService;

    @PostMapping("/create-user")
    public ResponseEntity<String> newUser(@RequestBody User user){
        if (userService.userExistsByMail(user))
            return new ResponseEntity<>("already in db",HttpStatus.FORBIDDEN);
        userService.saveUser(user);
        return new ResponseEntity<>("Tutto ok",HttpStatus.CREATED);
    }

    @PostMapping("/update-user")
    public ResponseEntity<String> updateUser(@RequestBody User user){
        if (!userService.userExistsByMail(user))
            return new ResponseEntity<>("already in db",HttpStatus.NOT_FOUND);
        userService.updateUser(user);
        return new ResponseEntity<>("Tutto ok",HttpStatus.OK);
    }

    
}