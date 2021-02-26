package com.ghostdovahkiin.librapi.bookservice.category.builder;

import com.ghostdovahkiin.librapi.bookservice.category.Category;

public class CategoryBuilder {
    public static Category.Builder createCategory() {
        return Category.builder()
                .id(123L)
                .name("Mathematics");
    }
}
