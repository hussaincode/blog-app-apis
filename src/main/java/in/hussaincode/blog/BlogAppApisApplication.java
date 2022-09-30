package in.hussaincode.blog;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.ModelMap;

import in.hussaincode.blog.config.AppConstants;
import in.hussaincode.blog.entities.Roles;
import in.hussaincode.blog.repositories.RoleRepo;

@SpringBootApplication
public class BlogAppApisApplication implements CommandLineRunner{
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepo roleRepo;

	public static void main(String[] args) {
		SpringApplication.run(BlogAppApisApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
	 System.out.println(this.passwordEncoder.encode("pass123"));
	 
	 try {
		 
		 Roles role = new Roles();
		 role.setId(AppConstants.ADMIN_USER);
		 role.setName("ROLE_ADMIN");
		 
		 Roles role1 = new Roles();
		 role1.setId(AppConstants.NORMAL_USER);
		 role1.setName("ROLE_NORMAL");
		 List<Roles> roles = List.of(role,role1);
		 List<Roles> result = this.roleRepo.saveAll(roles);
		 result.forEach(r->
		 {
			 System.out.println(r.getName());
		 });
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}

	
}
