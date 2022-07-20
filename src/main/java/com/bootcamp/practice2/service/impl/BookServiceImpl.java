package com.bootcamp.practice2.service.impl;
import com.bootcamp.practice2.model.Book;
import com.bootcamp.practice2.repository.BookRepository;
import com.bootcamp.practice2.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {return bookRepository.findAll();
    }

    @Override
    public Book findById(long id) {
        Optional<Book> op = bookRepository.findById(id);
        return op.isPresent() ? op.get() : new Book();
    }

    @Override
    public Book create(Book book) {
        return bookRepository.save(book);
    }


    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Book save(Book book) {
        return null;
    }
}
