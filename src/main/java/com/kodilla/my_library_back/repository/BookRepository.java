package com.kodilla.my_library_back.repository;

import com.kodilla.my_library_back.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    @Override
    List<Book> findAll();
}
