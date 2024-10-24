package com.kodilla.my_library_back.service;

import com.kodilla.my_library_back.domain.Shelf;
import com.kodilla.my_library_back.repository.ShelfRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShelfDbService {
    private final ShelfRepository shelfRepository;

    public List<Shelf> getAllShelves() {
        return shelfRepository.findAll();
    }
}
