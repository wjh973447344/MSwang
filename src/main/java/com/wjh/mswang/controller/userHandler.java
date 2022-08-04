package com.wjh.mswang.controller;

import com.alibaba.fastjson2.JSONObject;
import com.wjh.mswang.entity.user;
import com.wjh.mswang.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class userHandler {
    @Autowired
    private userRepository UserRepository;

    @GetMapping("/findAll")
    public List<user> findAll() {
        return UserRepository.findAll();
    }

    @GetMapping("/deleteById")
    public void deleteById(Integer id) {
        UserRepository.deleteById(id);
    }
    @PostMapping("/newOne")
    public void newOne(@RequestBody user users) {
        //user user = JSONObject.parseObject(users, user.class);
        UserRepository.save(users);
    }
    @PostMapping("/flush")
    public void flush(@RequestBody user users) {
        UserRepository.saveAndFlush(users);
    }
}


