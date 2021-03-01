package com.ghostdovahkiin.librapi.bookservice.book.services;

import com.ghostdovahkiin.librapi.bookservice.book.Book;
import com.ghostdovahkiin.librapi.bookservice.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GetBookBySpecificIDImpl implements GetBookBySpecificID{
    private final BookRepository bookRepository;

    @Override
    public Book getBySpecificID(String specificID) {
        return bookRepository.findBySpecificID(specificID);
    }
}
