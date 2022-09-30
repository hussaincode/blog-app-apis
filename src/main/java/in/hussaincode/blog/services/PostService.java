package in.hussaincode.blog.services;

import java.util.List;
import java.util.Set;

import in.hussaincode.blog.entities.Post;
import in.hussaincode.blog.payloads.PostDto;
import in.hussaincode.blog.payloads.PostResponse;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer posId);

	// getAll
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy,String sortDir);

	// getSinglepost
	PostDto getPostByid(Integer PostId);

	// Delete
	void deletePost(Integer postId);

	// getPOstByCategory
	Set<PostDto> getPostByCategory(Integer categoryId);

	// getAllPostByUser
	List<PostDto> getPostByUser(Integer userId);

	// Search Post
	List<PostDto> searchPosts(String keywords);

}
