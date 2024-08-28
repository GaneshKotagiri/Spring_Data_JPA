package com.chopchop.springdatajpa.repository;

import com.chopchop.springdatajpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);
    List<Student> findByMarksGreaterThan(int marks);
}
