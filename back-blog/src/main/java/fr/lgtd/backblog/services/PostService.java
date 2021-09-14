package fr.lgtd.backblog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lgtd.backblog.entities.Post;
import fr.lgtd.backblog.payloads.PostPlayload;
import fr.lgtd.backblog.payloads.UserPayload;
import fr.lgtd.backblog.repositories.PostRepo;
import fr.lgtd.backblog.repositories.UserRepo;

@Service()
public class PostService {

    @Autowired
    PostRepo repo;
    @Autowired
    UserRepo userRepo;

    // créer un post
    public Post createPost(PostPlayload post, UserPayload user) {
        Post newPost = new Post(post.getContent(), post.getTitle(), post.getDate(),
                userRepo.findByEmail(user.getEmail()));
        return repo.save(newPost);
    }

    // recup tout les postes
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

}
