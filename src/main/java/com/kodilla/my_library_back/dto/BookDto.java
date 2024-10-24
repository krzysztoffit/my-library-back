package com.kodilla.my_library_back.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BookDto {
    private Long id;
    private String title;
    private String author;
    private Integer publicationYear;
    private String description;
}
