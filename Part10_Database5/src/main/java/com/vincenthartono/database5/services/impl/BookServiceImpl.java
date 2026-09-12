package com.vincenthartono.database5.services.impl;

import com.vincenthartono.database5.domain.entities.BookEntity;
import com.vincenthartono.database5.repositories.BookRepository;
import com.vincenthartono.database5.services.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

    @Override
    public List<BookEntity> findAll() {
        return StreamSupport.stream(
                bookRepository.findAll().spliterator(),
                false)
                .collect(Collectors.toList());
    }
}
