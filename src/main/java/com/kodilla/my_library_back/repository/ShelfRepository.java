package com.kodilla.my_library_back.repository;

import com.kodilla.my_library_back.domain.Shelf;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShelfRepository extends CrudRepository<Shelf, Long> {
    @Override
    List<Shelf> findAll();
}
