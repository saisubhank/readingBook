package com.readingbooks.springboot.readingbooks.serviceImpl;

import com.readingbooks.springboot.readingbooks.entity.Books;
import com.readingbooks.springboot.readingbooks.repository.BooksRepository;
import com.readingbooks.springboot.readingbooks.service.BooksService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    private BooksRepository BooksRepository;

    public BooksServiceImpl(BooksRepository booksRepository) {
        super();
        this.BooksRepository = booksRepository;
    }

    @Override
    public List<Books> getAllBooks() {
        return BooksRepository.findAll();
    }

    @Override
    public Books saveBooks(Books books) {
        return BooksRepository.save(books);
    }

    @Override
    public void deleteBooksById(Long id) {
        BooksRepository.deleteById();
    }
}
