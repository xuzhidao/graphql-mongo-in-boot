package com.bezkoder.springgraphql.mongo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.springgraphql.mongo.model.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {

}