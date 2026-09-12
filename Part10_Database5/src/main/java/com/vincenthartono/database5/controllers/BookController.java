package com.vincenthartono.database5.controllers;

import com.vincenthartono.database5.domain.dto.BookDto;
import com.vincenthartono.database5.domain.entities.BookEntity;
import com.vincenthartono.database5.mappers.Mapper;
import com.vincenthartono.database5.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

    private Mapper<BookEntity, BookDto> bookMapper;

    private BookService bookService;

    public BookController(Mapper<BookEntity, BookDto> bookMapper, BookService bookService) {
        this.bookMapper = bookMapper;
        this.bookService = bookService;
    }

    @PutMapping("/books/{isbn}")
    public ResponseEntity<BookDto> createBook(
            @PathVariable("isbn") String isbn,
            @RequestBody BookDto bookDto) {
        BookEntity bookEntity = bookMapper.mapFrom(bookDto);
        BookEntity savedBookEntity = bookService.createBook(isbn, bookEntity);
        BookDto savedBookDto = bookMapper.MapTo(savedBookEntity);

        return new ResponseEntity<>(savedBookDto, HttpStatus.CREATED);
    }

    @GetMapping(path = "/books")
    public List<BookDto> listBooks(){
        List<BookEntity> books = bookService.findAll();
        return books.stream()
                .map(bookMapper::MapTo)
                .collect(Collectors.toList());
    }
    
}
