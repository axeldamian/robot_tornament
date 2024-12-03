package com.torneo.robotounament.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
//import com.torneo.robotounament.objects.Pilot;
import com.torneo.robotounament.objects.Team;

@Service
public class PilotService {

    private static final Logger log = LogManager.getLogger(PilotService.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    // Conectar a la base de datos
    MongoDatabase database = MongoClients.create("mongodb://localhost:27017/").getDatabase("robottounament");

    // Obtener la colección
    MongoCollection<Document> collection = database.getCollection("teams");

    public List<Team> getAllPilots() {
        // Obtener todos los elementos de la colección
        FindIterable<Document> documentos = collection.find();
        log.info(documentos);
        return mongoTemplate.findAll(Team.class);
    }
    
}
