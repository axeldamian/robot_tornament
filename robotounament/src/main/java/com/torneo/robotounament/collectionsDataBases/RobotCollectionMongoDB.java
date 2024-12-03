package com.torneo.robotounament.collectionsDataBases;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.torneo.robotounament.dtos.RobotJson;

public interface RobotCollectionMongoDB extends MongoRepository<RobotJson, String> {
}
