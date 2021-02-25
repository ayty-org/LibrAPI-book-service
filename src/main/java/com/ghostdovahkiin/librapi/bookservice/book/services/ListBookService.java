package com.ghostdovahkiin.librapi.bookservice.book.services;

import com.ghostdovahkiin.librapi.bookservice.book.Book;

import java.util.List;

@FunctionalInterface
public interface ListBookService {
    List<Book> findAll();
}
