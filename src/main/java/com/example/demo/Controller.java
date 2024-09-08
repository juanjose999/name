package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired
    private repository repository;

    @GetMapping
    public List<Users> all(){
        return repository.findAll();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @PostMapping
    private Users save(@RequestBody Users user){
        return repository.save(user);
    }
}
