package com.kodilla.my_library_back.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "BOOKS")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "TITLE", nullable = false)
    private String title;
    @Column(name = "AUTHOR", nullable = false)
    private String author;
    @Column(name = "PUBLICATION_YEAR")
    private Integer publicationYear;
    @Column(name = "DESCRIPTION")
    private String description;
    @JoinColumn(name = "SHELF_ID")
    private Shelf shelf;
}
