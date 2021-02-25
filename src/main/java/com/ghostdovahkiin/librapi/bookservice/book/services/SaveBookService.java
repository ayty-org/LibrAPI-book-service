package com.ghostdovahkiin.librapi.bookservice.book.services;

import com.ghostdovahkiin.librapi.bookservice.book.Book;

@FunctionalInterface
public interface SaveBookService {
    void save(Book book);
}
