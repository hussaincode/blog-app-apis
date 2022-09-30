package in.hussaincode.blog.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hussaincode.blog.entities.Comment;
import in.hussaincode.blog.entities.Post;
import in.hussaincode.blog.exceptions.ResourceNotFoundException;
import in.hussaincode.blog.payloads.CommentDto;
import in.hussaincode.blog.repositories.CommentRepo;
import in.hussaincode.blog.repositories.PostRepo;
import in.hussaincode.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	PostRepo postRepo;
	
	@Autowired
	CommentRepo commentRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post = this.postRepo.findById(postId)
				.orElseThrow(()-> new ResourceNotFoundException("Post", "post id", postId));
		Comment comment = this.modelMapper.map(commentDto, Comment.class);	
		comment.setPost(post);
		Comment savedComment = this.commentRepo.save(comment);
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment comm =this.commentRepo.findById(commentId)
				.orElseThrow(()-> new ResourceNotFoundException("Comment", "comment id", commentId));
		this.commentRepo.delete(comm);
	}

}
