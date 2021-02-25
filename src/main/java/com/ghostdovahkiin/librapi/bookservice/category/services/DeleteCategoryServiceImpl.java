package com.ghostdovahkiin.librapi.bookservice.category.services;

import com.ghostdovahkiin.librapi.bookservice.category.CategoryRepository;
import com.ghostdovahkiin.librapi.bookservice.exceptions.CategoryNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCategoryServiceImpl implements DeleteCategoryService{
    private final CategoryRepository categoryRepository;

    @Override
    public void delete(Long id) {
        if(!categoryRepository.existsById(id)){
            throw new CategoryNotFoundException();
        }
        categoryRepository.deleteById(id);
    }
}
