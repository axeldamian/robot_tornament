package com.torneo.robotounament.collectionsDataBases;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.torneo.robotounament.dtos.TeamJson;

public interface TeamJsonCollectionMongoDB extends MongoRepository<TeamJson, String> {
}
