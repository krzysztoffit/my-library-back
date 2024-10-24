package com.kodilla.my_library_back.controller;

import com.kodilla.my_library_back.dto.BookDto;
import com.kodilla.my_library_back.mapper.BookMapper;
import com.kodilla.my_library_back.service.BookDbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/books")
@RequiredArgsConstructor
public class BookController {
    private final BookMapper bookMapper;
    private final BookDbService bookDbService;

    public ResponseEntity<List<BookDto>> getAllBooks() {
        return ResponseEntity.ok(bookMapper.booksToBooksDtoMapper(bookDbService.getAllBooks()));
    }
}
