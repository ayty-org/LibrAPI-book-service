package com.ghostdovahkiin.librapi.bookservice.book.services;

import com.ghostdovahkiin.librapi.bookservice.book.Book;
import com.ghostdovahkiin.librapi.bookservice.book.BookRepository;
import com.ghostdovahkiin.librapi.bookservice.exceptions.BookNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetBookServiceImpl implements GetBookService{
    private final BookRepository bookRepository;

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
    }
}
