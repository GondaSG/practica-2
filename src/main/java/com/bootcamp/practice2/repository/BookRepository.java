package com.bootcamp.practice2.repository;
import com.bootcamp.practice2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
}
