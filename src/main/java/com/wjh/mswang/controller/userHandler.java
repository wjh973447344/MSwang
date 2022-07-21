package com.wjh.mswang.controller;

import com.wjh.mswang.entity.user;
import com.wjh.mswang.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userHandler {
    @Autowired
    private userRepository UserRepository;
    @GetMapping("/findAll")
    public List<user> findAll() {
        return UserRepository.findAll();
    }
}

