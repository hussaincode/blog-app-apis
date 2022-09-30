package in.hussaincode.blog.services;

import java.util.List;

import in.hussaincode.blog.payloads.UserDto;

public interface UserService {
	
	UserDto registerNewUser(UserDto user);

	UserDto createUser(UserDto userDto);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto getUserById(Integer userId);

	List<UserDto> getAllUser();

	void deleteUser(Integer userId);

}
