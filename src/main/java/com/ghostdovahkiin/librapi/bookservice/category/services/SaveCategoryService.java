package com.ghostdovahkiin.librapi.bookservice.category.services;

import com.ghostdovahkiin.librapi.bookservice.category.Category;

@FunctionalInterface
public interface SaveCategoryService {
    void save(Category bookCategory);
}
