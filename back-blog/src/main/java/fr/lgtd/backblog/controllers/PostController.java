package fr.lgtd.backblog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.lgtd.backblog.entities.Post;
import fr.lgtd.backblog.payloads.PostPlayload;
import fr.lgtd.backblog.payloads.UserPayload;
import fr.lgtd.backblog.services.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = { "*" }, maxAge = 3600)
@RestController
public class PostController {

    @Autowired
    PostService service;

    @GetMapping(value = "/post/getall")
    public List<Post> getMethodName() {
        return service.getAllPosts();
    }

    @PostMapping(value = "/post/create")
    public Post postMethodName(@RequestBody PostPlayload post) {
        return service.createPost(post, post.getUser());
    }

}
