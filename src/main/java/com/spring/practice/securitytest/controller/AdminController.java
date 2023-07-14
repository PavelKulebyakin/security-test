package com.spring.practice.securitytest.controller;

import com.spring.practice.securitytest.repository.UserRepository;
import com.spring.practice.securitytest.user.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private UserRepository repository;
    @PostMapping
    public User addNewUser(User user){
        return repository.save(user);
    }

}
