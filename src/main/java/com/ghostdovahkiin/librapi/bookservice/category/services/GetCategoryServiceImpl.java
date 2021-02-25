package com.ghostdovahkiin.librapi.bookservice.category.services;

import com.ghostdovahkiin.librapi.bookservice.category.Category;
import com.ghostdovahkiin.librapi.bookservice.category.CategoryRepository;
import com.ghostdovahkiin.librapi.bookservice.exceptions.CategoryNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetCategoryServiceImpl implements GetCategoryService {
    private final CategoryRepository categoryRepository;


    @Override
    public Category getById(Long id) {
        return categoryRepository.findById(id).orElseThrow(CategoryNotFoundException::new);
    }
}
