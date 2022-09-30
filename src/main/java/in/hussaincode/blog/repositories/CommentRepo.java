package in.hussaincode.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hussaincode.blog.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

}
