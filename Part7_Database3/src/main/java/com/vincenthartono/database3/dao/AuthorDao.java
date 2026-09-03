package com.vincenthartono.database3.dao;

import com.vincenthartono.database3.domain.Author;
import java.util.Optional;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long l);
}
