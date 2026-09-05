package com.vincenthartono.database3.dao;

import com.vincenthartono.database3.domain.Author;
import java.util.Optional;
import java.util.List;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long l);

    List<Author> find();
}
