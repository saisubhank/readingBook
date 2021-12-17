package com.readingbooks.springboot.readingbooks.service;

import com.readingbooks.springboot.readingbooks.entity.Books;

import java.util.List;

public interface BooksService {
    List<Books> getAllBooks();

    Books saveBooks(Books books);


    void deleteBooksById(Long id);
}
