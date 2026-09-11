package com.vincenthartono.database5.services.impl;

import com.vincenthartono.database5.domain.entities.BookEntity;
import com.vincenthartono.database5.repositories.BookRepository;
import com.vincenthartono.database5.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(String isbn, BookEntity book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }
}
