package com.example.springboothibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboothibernate.models.Course;
import com.example.springboothibernate.service.StudentCourseService;

@RestController
public class StudentCourseController {
	
	@Autowired
	private StudentCourseService studentCourseService;
	
	@GetMapping("/processData")
	public void processData() {
		studentCourseService.processData();
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return studentCourseService.findAll();
	}
}
