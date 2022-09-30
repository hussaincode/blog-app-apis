package in.hussaincode.blog.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import in.hussaincode.blog.entities.Roles;

public interface RoleRepo  extends JpaRepository<Roles, Integer>{

}
