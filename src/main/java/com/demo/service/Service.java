package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.entity.Student;
import com.demo.repo.Repo;
@org.springframework.stereotype.Service
public class Service {

	@Autowired
	Repo repo;
	
	public Student add(Student stu) {
		return repo.save(stu);
	}
	
	public List<Student> getall() {
		return repo.findAll();
	}
	public Student getbyid(Integer id){
		return repo.findById(id).get();
	}
	public void deletebyid(Integer id) {
		repo.deleteById(id);
	}
}
