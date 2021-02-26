package com.ghostdovahkiin.librapi.bookservice.book.builder;

import com.ghostdovahkiin.librapi.bookservice.book.Book;
import com.ghostdovahkiin.librapi.bookservice.category.Category;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class BookBuilder {

    public static Book.Builder createBook(){
        Set<Category> categorySet = new HashSet<>();
        categorySet.add(new Category(1,"Geografia"));
        return Book.builder()
                .id(123L)
                .isbn("12345678912345678")
                .title("book")
                .author("author")
                .publicationYear(LocalDate.of(2020, 2, 15))
                .availableQuantity(2)
                .synopsis("synopsis")
                .category(categorySet)
                .sellPrice(15.00);

    }
}
