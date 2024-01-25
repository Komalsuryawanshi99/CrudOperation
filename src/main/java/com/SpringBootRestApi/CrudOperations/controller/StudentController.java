package com.SpringBootRestApi.CrudOperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootRestApi.CrudOperations.model.Student;
import com.SpringBootRestApi.CrudOperations.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
	
		Student saveStudent = service.saveStudent(student);		
		
		return saveStudent;
	}
	
	@GetMapping("/show")
	public List<Student> findAllStudent() {
		
		List<Student> findAllStudent = service.findAllStudent();
		
		return findAllStudent;
	}

	@PutMapping("/Student")
	public Student putStudent(@RequestBody Student student) {
		Student updateStudent = service.updateStudent(student);
		return updateStudent;

	}

	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}
	
	

}
