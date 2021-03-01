package com.ghostdovahkiin.librapi.bookservice.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findBySpecificID(String specificID);
    List<Book> findBookByCategoryName(String categoryName);
    boolean existsByIsbn(String isbn);
}
