package com.bootcamp.practice2.service;

import com.bootcamp.practice2.model.Book;

import java.util.List;

public interface IBookService {

    List<Book> findAll();
    Book findById(long id);
    Book create(Book book);
    Book update(Book book);
    void delete(long id);

    void deleteById(long id);

    Book save(Book book);
}
