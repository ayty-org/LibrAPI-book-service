package com.ghostdovahkiin.librapi.bookservice.category.services;

import com.ghostdovahkiin.librapi.bookservice.category.Category;
import com.ghostdovahkiin.librapi.bookservice.category.CategoryRepository;
import com.ghostdovahkiin.librapi.bookservice.exceptions.CategoryNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UpdateCategoryServiceImpl implements UpdateCategoryService{
    private final CategoryRepository categoryRepository;

    @Override
    public void update(Category category, Long id) {
        Category categoryFound = categoryRepository.findById(id).orElseThrow(CategoryNotFoundException::new);
        categoryFound.setName(category.getName());
        categoryRepository.save(categoryFound);
    }
}
