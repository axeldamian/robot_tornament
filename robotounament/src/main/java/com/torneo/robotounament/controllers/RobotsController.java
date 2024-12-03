package com.torneo.robotounament.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torneo.robotounament.dtos.RobotJson;
import com.torneo.robotounament.services.RobotService;

@RestController
@RequestMapping("/robots")
public class RobotsController {

        @Autowired
        private RobotService service;

        @PostMapping(value = "/create")
        public ResponseEntity<String> create(@RequestBody RobotJson robot) {

                service.ramdomComponents(robot);

                return new ResponseEntity<String>("Robot random created successfully", HttpStatus.OK);
        }
    
}
