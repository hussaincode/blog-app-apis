package in.hussaincode.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hussaincode.blog.entities.Category;
import in.hussaincode.blog.payloads.CategoryDto;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
}
