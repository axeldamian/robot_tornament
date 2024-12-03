package com.torneo.robotounament.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torneo.robotounament.collectionsDataBases.TeamJsonCollectionMongoDB;
import com.torneo.robotounament.dtos.TeamJson;

@Service
public class TeamService {

    //@Autowired
    //private MongoTemplate mongoTemplate;

    @Autowired
    private TeamJsonCollectionMongoDB collectionTeams;
    
    private static final Logger log = LogManager.getLogger(TeamService.class);
    
    public void createTeam(TeamJson team){
        collectionTeams.save(team);
        //mongoTemplate.save(team);
        log.info("build a team");
    }

    public List<TeamJson> showAll() {
        return collectionTeams.findAll();
    }
    
}
