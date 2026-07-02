package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    // Constructor Injection
    public BookService(BookRepository repository) {
        System.out.println("Constructor Injection Executed");
        this.repository = repository;
    }

    // Setter Injection
    public void setRepository(BookRepository repository) {
        System.out.println("Setter Injection Executed");
        this.repository = repository;
    }

    public void displayService() {
        System.out.println("Book Service Method Called");
        repository.displayRepository();
    }
}