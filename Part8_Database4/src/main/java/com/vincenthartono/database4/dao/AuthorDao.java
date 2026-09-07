package com.vincenthartono.database4.dao;

import com.vincenthartono.database4.domain.Author;
import java.util.Optional;
import java.util.List;

public interface AuthorDao {
    void create(Author author);

    Optional<Author> findOne(long l);

    List<Author> find();

    void update(long id, Author author);

    void delete(long id);
}
