package com.torneo.robotounament.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torneo.robotounament.services.BuildRobot;

@RestController
public class RobotsController {

        @Autowired
        private BuildRobot service;

        @PostMapping(value = "/build")
        public ResponseEntity<String> build() {

                service.ramdomComponents();

                return new ResponseEntity<String>("Robot random created successfully", HttpStatus.OK);
        }
    
}
