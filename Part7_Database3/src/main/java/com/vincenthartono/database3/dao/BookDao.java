package com.vincenthartono.database3.dao;

import com.vincenthartono.database3.domain.Book;

import java.util.Optional;
import java.util.List;

public interface BookDao {
    void create(Book book);

    Optional<Book> findOne(String isbn);

    List<Book> find();
}
