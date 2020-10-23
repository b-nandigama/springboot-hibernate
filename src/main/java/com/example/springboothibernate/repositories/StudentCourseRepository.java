package com.example.springboothibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboothibernate.models.Course;

@Repository
public interface StudentCourseRepository extends JpaRepository<Course, Long> {

}
