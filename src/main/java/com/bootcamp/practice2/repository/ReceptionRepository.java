package com.bootcamp.practice2.repository;
import com.bootcamp.practice2.model.Reception;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionRepository extends JpaRepository<Reception, Long>{
}
