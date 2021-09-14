package fr.lgtd.backblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.lgtd.backblog.entities.Post;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {

}
