package com.bootcamp.practice2.repository;
import com.bootcamp.practice2.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long>{
}
