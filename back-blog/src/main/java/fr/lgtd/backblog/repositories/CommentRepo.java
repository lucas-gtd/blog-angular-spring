package fr.lgtd.backblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.lgtd.backblog.entities.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {

}
