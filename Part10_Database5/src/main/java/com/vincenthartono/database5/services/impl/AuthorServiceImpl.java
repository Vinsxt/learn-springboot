package com.vincenthartono.database5.services.impl;

import com.vincenthartono.database5.domain.entities.AuthorEntity;
import com.vincenthartono.database5.repositories.AuthorRepository;
import com.vincenthartono.database5.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
