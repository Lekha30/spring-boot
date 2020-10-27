package com.jaya.springboot.controller;

import com.jaya.springboot.model.Book;
import com.jaya.springboot.model.Person;
import com.jaya.springboot.repository.BookRepository;
import com.jaya.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookRepository repository;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        System.out.println("Get all Books...");

        List<Book> books = new ArrayList<>();
        repository.findAll().forEach(books::add);

        return books;
    }
}
