package in.hussaincode.blog.security;

import in.hussaincode.blog.payloads.UserDto;
import lombok.Data;

@Data
public class JwtAuthResponse {
	
	private String token;
	private UserDto user;

}
