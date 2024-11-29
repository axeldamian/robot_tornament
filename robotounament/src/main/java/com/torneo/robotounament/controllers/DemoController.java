package com.torneo.robotounament.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torneo.robotounament.dtos.User;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private MongoTemplate mongoTemplate;
    
    @PostMapping
    public void crearUsuario(@RequestBody User user) {
        mongoTemplate.save(user);
    }
    
}
