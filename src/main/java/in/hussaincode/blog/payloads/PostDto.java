package in.hussaincode.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import in.hussaincode.blog.entities.Category;
import in.hussaincode.blog.entities.Comment;
import in.hussaincode.blog.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
	
	private String postId;
	private String postTitle;
	private String postContent;
	private String postImageName;
	private Date postAddedDate;

	private CategoryDto category;

	private UserDto user;
	
	private Set<CommentDto> comments = new HashSet<>();

}
