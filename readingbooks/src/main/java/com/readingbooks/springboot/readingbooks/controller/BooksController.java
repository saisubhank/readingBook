package com.readingbooks.springboot.readingbooks.controller;

import com.readingbooks.springboot.readingbooks.entity.Books;
import com.readingbooks.springboot.readingbooks.service.BooksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class BooksController {
    @Autowired
	private BooksService booksService;

    public BooksController(BooksService booksService){
        super();
        this.booksService = booksService;
    }
    @GetMapping("/books/list")
    public String listBooks(Model model){
            model.addAttribute("books",booksService.getAllBooks());
            return listBooks(model);
    }

    @PostMapping("/books/list/new")
    public String saveBook(@ModelAttribute("books") Books books, Model model){
        model.addAttribute("books",books);
        booksService.saveBooks(books);
        return "redirect:/books/list";
    }
    @GetMapping("/books/{id}")
    public String deleteBook(@PathVariable Long id) {
        booksService.deleteBooksById(id);
        return "redirect:/books/list";
    }
}
