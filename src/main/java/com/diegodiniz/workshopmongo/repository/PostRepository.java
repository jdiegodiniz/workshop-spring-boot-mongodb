package com.diegodiniz.workshopmongo.repository;

import com.diegodiniz.workshopmongo.domain.Post;
import com.diegodiniz.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
