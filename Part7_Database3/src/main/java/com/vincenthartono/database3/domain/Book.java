package com.vincenthartono.database3.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

@Log
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book {

    private String isbn;

    private String title;

    private Long authorId;
    
}
