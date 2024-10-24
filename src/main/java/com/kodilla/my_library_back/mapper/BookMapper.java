package com.kodilla.my_library_back.mapper;

import com.kodilla.my_library_back.domain.Book;
import com.kodilla.my_library_back.dto.BookDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookMapper {
    public List<BookDto> booksToBooksDtoMapper(List<Book> books) {
        return books.stream()
                .map(this::bookToBookDtoMapper)
                .toList();
    }

    public BookDto bookToBookDtoMapper(Book book) {
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .author(book.getAuthor())
                .publicationYear(book.getPublicationYear())
                .description(book.getDescription())
                .build();
    }
}
