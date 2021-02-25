package com.ghostdovahkiin.librapi.bookservice.category.services;

import com.ghostdovahkiin.librapi.bookservice.category.Category;

@FunctionalInterface
public interface GetCategoryService {
    Category getById(Long id);
}
