package com.ghostdovahkiin.librapi.bookservice.book.services;

import com.ghostdovahkiin.librapi.bookservice.book.Book;

@FunctionalInterface
public interface GetBookBySpecificID {
    Book getBySpecificID(String specificID);
}
