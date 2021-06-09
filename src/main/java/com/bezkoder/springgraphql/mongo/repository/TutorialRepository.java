package com.bezkoder.springgraphql.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.springgraphql.mongo.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
}
