package com.foundjob.joblisting.controller;


import com.foundjob.joblisting.model.Post;
import com.foundjob.joblisting.repository.PostRepository;
import com.foundjob.joblisting.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository srepo;



    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }


    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<Post> search(@PathVariable String text){
        return srepo.findByText(text);
    }


    @PostMapping("/post")
    @CrossOrigin
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }
}
