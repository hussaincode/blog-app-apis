package in.hussaincode.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import in.hussaincode.blog.entities.Roles;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;

	@NotEmpty
	@Size(min = 4, message = "Useername must be of atleast 4 character")
	private String name;

	@Email(message = "Email address is not valid!")
	private String email;

	@NotEmpty
	@Size(min = 5, max = 10, message = "password must be between 5 to 10 char")
	@Pattern(regexp = "^[a-zA-Z0-9]", message = "password must contain combination of char and num")
	private String password;

	@NotEmpty
	private String about;
	
	private Set<RolesDto> role =new HashSet<>();

}
