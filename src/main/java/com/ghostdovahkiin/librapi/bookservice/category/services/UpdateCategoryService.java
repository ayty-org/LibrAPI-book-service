package com.ghostdovahkiin.librapi.bookservice.category.services;

import com.ghostdovahkiin.librapi.bookservice.category.Category;

@FunctionalInterface
public interface UpdateCategoryService {
    void update(Category category, Long id);
}
