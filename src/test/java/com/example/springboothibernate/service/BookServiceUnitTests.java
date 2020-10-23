package com.example.springboothibernate.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springboothibernate.models.Book;

@SpringBootTest
public class BookServiceUnitTests {
	@Autowired
	private BookService bookService;
	
	@Test
	public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
		List<Book> books = bookService.list();
		
		assertEquals(books.size(), 3);
	}
}
