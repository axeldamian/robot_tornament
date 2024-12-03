package com.torneo.robotounament;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RobotounamentApplication {

	private static final Logger log = LogManager.getLogger(RobotounamentApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RobotounamentApplication.class, args);
		log.info("start game");
	}

}
