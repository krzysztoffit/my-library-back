package com.kodilla.my_library_back.mapper;

import com.kodilla.my_library_back.domain.Shelf;
import com.kodilla.my_library_back.dto.ShelfDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShelfMapper {
    public List<ShelfDto> shelvesToShelvesDtoMapper(List<Shelf> shelves) {
        return shelves.stream()
                .map(this::shelfToShelfDtoMapper)
                .toList();
    }

    public ShelfDto shelfToShelfDtoMapper(Shelf shelf) {
        return ShelfDto.builder()
                .id(shelf.getId())
                .name(shelf.getName())
                .build();
    }
}
