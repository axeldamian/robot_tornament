package com.torneo.robotounament.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.torneo.robotounament.objects.Robot;

@Service
public class BuildRobot {
    
    private static final Logger log = LogManager.getLogger(BuildRobot.class);
    
    public Robot ramdomComponents(){
        Robot r = new Robot();
        log.info("random robot");
        return r;
    }
}
