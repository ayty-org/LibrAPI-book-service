package com.ghostdovahkiin.librapi.bookservice.book.v1;

import com.ghostdovahkiin.librapi.bookservice.book.Book;
import com.ghostdovahkiin.librapi.bookservice.book.BookDTO;
import com.ghostdovahkiin.librapi.bookservice.book.services.DeleteBookService;
import com.ghostdovahkiin.librapi.bookservice.book.services.GetBookService;
import com.ghostdovahkiin.librapi.bookservice.book.services.ListBookByCategoryNameService;
import com.ghostdovahkiin.librapi.bookservice.book.services.ListBookService;
import com.ghostdovahkiin.librapi.bookservice.book.services.ListPageBookService;
import com.ghostdovahkiin.librapi.bookservice.book.services.SaveBookService;
import com.ghostdovahkiin.librapi.bookservice.book.services.UpdateBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("v1/api/books")
public class BookController {
    private final ListBookService listBookService;
    private final ListPageBookService listPageBookService;
    private final GetBookService getBookService;
    private final SaveBookService saveBookService;
    private final ListBookByCategoryNameService listBookByCategoryNameService;
    private final UpdateBookService updateBookService;
    private final DeleteBookService deleteBookService;

    @GetMapping(path = "/")
    @ResponseStatus(HttpStatus.OK)
    public Page<BookDTO> findAllPageable(Pageable pageable) {
        return BookDTO.fromPage(listPageBookService.listBooks(pageable));
    }

    @GetMapping(path = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<BookDTO> findAll() {
        return BookDTO.fromAll(listBookService.findAll());
    }

    @GetMapping(path = "/category/{categoryName}")
    @ResponseStatus(HttpStatus.OK)
    public List<BookDTO> findBookByCategoriesName(@PathVariable String categoryName){
        return BookDTO.fromAll(listBookByCategoryNameService.findBookByCategoriesName(categoryName));
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public BookDTO findById(@PathVariable Long id) {
        return BookDTO.from(getBookService.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@Valid @RequestBody BookDTO bookDTO){
        saveBookService.save(Book.to(bookDTO));
    }

    @PutMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Valid @RequestBody BookDTO bookDTO, @PathVariable Long id) {
        updateBookService.update(Book.to(bookDTO), id);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        deleteBookService.delete(id);
    }
}
