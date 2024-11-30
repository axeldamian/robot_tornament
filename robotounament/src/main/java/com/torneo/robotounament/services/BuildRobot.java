package com.torneo.robotounament.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.torneo.robotounament.dtos.RobotJson;

@Service
public class BuildRobot {

    @Autowired
    private MongoTemplate mongoTemplate;
    
    private static final Logger log = LogManager.getLogger(BuildRobot.class);
    
    public void ramdomComponents(RobotJson r){
        mongoTemplate.save(r);
        log.info("random robot");
    }
}
