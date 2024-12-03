package com.torneo.robotounament.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torneo.robotounament.dtos.TeamJson;
import com.torneo.robotounament.services.TeamService;


@RestController
@RequestMapping("/teams")
public class TeamController {
    
    private static final Logger log = LogManager.getLogger(TeamController.class);

        @Autowired
        private TeamService service;

        @PostMapping(value = "/create")
        public ResponseEntity<String> build(@RequestBody TeamJson json) {

                service.createTeam(json);

                return new ResponseEntity<String>("team created successfully", HttpStatus.OK);
        }

        @GetMapping(value= "/show")
        public List<TeamJson> showTeams() {
                log.info("/teams/show endpoint");
                return service.showAll();
        }
        

}
