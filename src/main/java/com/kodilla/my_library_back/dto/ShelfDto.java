package com.kodilla.my_library_back.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class ShelfDto {
    private Long id;
    private String name;
    private List<BookDto> books;
}
