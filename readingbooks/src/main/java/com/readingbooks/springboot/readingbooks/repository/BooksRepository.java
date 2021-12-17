package com.readingbooks.springboot.readingbooks.repository;

import com.readingbooks.springboot.readingbooks.entity.Books;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface BooksRepository extends jpaRepository<Books,Long> {
     List<Books> findAll();

    Books save(Books books);

    void deleteById();

}
