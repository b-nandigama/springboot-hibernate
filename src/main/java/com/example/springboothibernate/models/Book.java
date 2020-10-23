package com.example.springboothibernate.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "BOOK")
@Data
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	//constructor
	public Book(String name) {
		this.name = name;
	}
}
