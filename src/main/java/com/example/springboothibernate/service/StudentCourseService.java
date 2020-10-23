package com.example.springboothibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.springboothibernate.models.Course;
import com.example.springboothibernate.models.Student;
import com.example.springboothibernate.repositories.StudentCourseRepository;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class StudentCourseService {

	@Autowired
	private StudentCourseRepository studentCourseRepository;
	
	//Describes a transaction attribute on an individual method or on a class. 
    //At the class level, this annotation applies as a default to all methods ofthe declaring class and its subclasses. 
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, rollbackFor = Exception.class)
	public void processData() {
		Course courseA = new Course("Course A");
		List<Student> list1 = new ArrayList<Student>();
		list1.add(new Student("Ravi", courseA));
		list1.add(new Student("Gopi", courseA));
		list1.add(new Student("Kamesh", courseA));
		list1.add(new Student("Ravi", courseA));

		
		Course courseB = new Course("Course B");
		List<Student> list2 = new ArrayList<Student>();
		list1.add(new Student("Roja", courseB));
		list1.add(new Student("Sasi", courseB));
		list1.add(new Student("Keerthi", courseB));
		list1.add(new Student("Roja", courseB));
		list1.add(new Student("Sasi", courseB));
		
		
		
		courseA.setStudents(list1);
		courseB.setStudents(list2);
		
		studentCourseRepository.save(courseA);
		studentCourseRepository.save(courseB);
		
		//studentCourseRepository.findAll().forEach(data -> log.info(data));
	}
	
	//Annotation indicating that the result of invoking a method (or all methodsin a class) can be cached. 
	@Cacheable(value = "studentCourseCache")
	public List<Course> findAll(){
		return studentCourseRepository.findAll();
	}
	
}
