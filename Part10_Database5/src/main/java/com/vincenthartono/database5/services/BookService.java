package com.vincenthartono.database5.services;

import com.vincenthartono.database5.domain.entities.BookEntity;

import java.util.List;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);

    List<BookEntity> findAll();
}
