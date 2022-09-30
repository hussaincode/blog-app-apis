package in.hussaincode.blog.payloads;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;

	@NotEmpty
	@Size(min = 4, message = "Category Title must be of atleast 4 character")
	private String categoryTitle;

	@NotEmpty
	@Size(min = 10, message = "Description must be of atleast 10 character")
	private String categoryDesc;

}
