package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;
import com.demo.service.Service;
@RestController
public class Controller {

	@Autowired
	Service service;
	
	// to get all student
	@GetMapping("/")
	public List<Student> getstu(){
		return service.getall();
	}
	//to add new student 
	@PostMapping("/addstudent")
	public Student addstu(@RequestBody Student student) {
		return service.add(student);
	}
	//to get student by id
	@GetMapping("/id/{id}")
	public Student stuid(@PathVariable Integer id) {
		return service.getbyid(id);
	}
	//to update a student
	@PutMapping("/update")
	public Student updatestu(@RequestBody Student student) {
		return service.add(student);
	}
	//to delete a student
	@DeleteMapping("/delete/{id}")
	public void deletestu(@PathVariable Integer id) {
		service.deletebyid(id);
	}
 }
