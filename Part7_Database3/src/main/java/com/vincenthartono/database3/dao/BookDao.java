package com.vincenthartono.database3.dao;

import com.vincenthartono.database3.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> find(String isbn);
}
