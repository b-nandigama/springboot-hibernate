package com.example.springboothibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboothibernate.service.StudentCourseService;

@SpringBootApplication
public class SpringbootHibernateApplication {

	@Autowired
	private StudentCourseService studentCourseService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateApplication.class, args);
	}
}
