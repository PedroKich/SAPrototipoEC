package com.DenunciaDeCrimeAmbiental.projeto.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DenunciaDeCrimeAmbiental.projeto.entities.User;
import com.DenunciaDeCrimeAmbiental.projeto.repositories.UserRepository;


@RestController
@RequestMapping("/users")
public class UserController {
 
        @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity<?> createUser() {
        
        List<User> users = new ArrayList<>();
        try {

            users = userRepository.findAll();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return ResponseEntity.ok(users);
    }
    


}
