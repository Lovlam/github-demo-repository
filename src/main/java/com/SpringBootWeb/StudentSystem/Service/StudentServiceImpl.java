package com.SpringBootWeb.StudentSystem.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootWeb.StudentSystem.model.Student;
import com.SpringBootWeb.StudentSystem.repository.StudentRepository;




@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}
	
	

}
