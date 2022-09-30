package in.hussaincode.blog.services;

import java.util.List;

import in.hussaincode.blog.payloads.CategoryDto;

public interface CategoryService {

	// create
	CategoryDto createCategory(CategoryDto categoryDto);

	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// get
	CategoryDto getCategoryById(Integer categoryId);

	// get all
	List<CategoryDto> getAllCategory();

	// delete
	void deleteCategory(Integer categoryId);
}
