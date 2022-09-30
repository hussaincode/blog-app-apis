package in.hussaincode.blog.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.hussaincode.blog.entities.Category;
import in.hussaincode.blog.entities.Post;
import in.hussaincode.blog.entities.User;
import in.hussaincode.blog.payloads.PostDto;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);

	Set<Post> findByCategory(Category category);
	
	@Query("select p from Post p where p.postTitle like:key")  //if query is not working automatically or giving any error then we can write query by ourselves as well
	List<Post> searchByTitle(@Param("key") String postTitle);
	
}
