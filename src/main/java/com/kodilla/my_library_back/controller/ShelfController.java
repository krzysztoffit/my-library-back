package com.kodilla.my_library_back.controller;

import com.kodilla.my_library_back.dto.ShelfDto;
import com.kodilla.my_library_back.mapper.ShelfMapper;
import com.kodilla.my_library_back.service.ShelfDbService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/shelves")
@AllArgsConstructor
public class ShelfController {
    private final ShelfMapper shelfMapper;
    private final ShelfDbService shelfDbService;

    public ResponseEntity<List<ShelfDto>> getAllShelves() {
        return ResponseEntity.ok(shelfMapper.shelvesToShelvesDtoMapper(shelfDbService.getAllShelves()));
    }

}
