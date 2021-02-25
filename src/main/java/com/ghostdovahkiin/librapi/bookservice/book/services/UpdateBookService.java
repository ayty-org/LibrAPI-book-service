package com.ghostdovahkiin.librapi.bookservice.book.services;

import com.ghostdovahkiin.librapi.bookservice.book.Book;

@FunctionalInterface
public interface UpdateBookService {
    void update(Book book, Long id);
}
