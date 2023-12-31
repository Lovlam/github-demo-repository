package com.SpringBootWeb.StudentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootWeb.StudentSystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	 

}
