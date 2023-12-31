package com.SpringBootWeb.StudentSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootWeb.StudentSystem.Service.StudentService;
import com.SpringBootWeb.StudentSystem.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		
		studentService.saveStudent(student);
		return "new student is added";
	}
	
	
}
