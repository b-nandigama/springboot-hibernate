package com.example.springboothibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboothibernate.models.Book;
import com.example.springboothibernate.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> list() {
		return bookRepository.findAll();
	}
}
