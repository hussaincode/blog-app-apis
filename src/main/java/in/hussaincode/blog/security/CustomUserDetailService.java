package in.hussaincode.blog.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.hussaincode.blog.entities.User;
import in.hussaincode.blog.exceptions.ResourceNotFoundException;
import in.hussaincode.blog.repositories.UserRepo;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//loading user from database by username
		User user = this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User", "Email : "+username, 0));
		return user;
	}
	
	

}
