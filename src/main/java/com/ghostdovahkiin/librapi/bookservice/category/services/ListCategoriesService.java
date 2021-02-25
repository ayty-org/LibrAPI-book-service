package com.ghostdovahkiin.librapi.bookservice.category.services;

import com.ghostdovahkiin.librapi.bookservice.category.Category;

import java.util.List;

@FunctionalInterface
public interface ListCategoriesService {
    List<Category> findAll();
}
