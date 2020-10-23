package com.example.springboothibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboothibernate.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
	
}
