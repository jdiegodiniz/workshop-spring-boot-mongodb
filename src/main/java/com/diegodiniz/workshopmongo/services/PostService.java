package com.diegodiniz.workshopmongo.services;

import com.diegodiniz.workshopmongo.domain.Post;
import com.diegodiniz.workshopmongo.repository.PostRepository;
import com.diegodiniz.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
