package com.springswagger.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springswagger.Services.IStudentServices;
import com.springswagger.model.Students;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/StudentDetails")
@Api(value="Student Management system")
public class StudentController {
	@Autowired
	IStudentServices service;
	
	@GetMapping("/students")
	@ApiOperation(value="show all student details")
	public List<Students> getAllStudents()
	{
		
		return service.getAllStudentDetails();
	}
	@PostMapping("/students")
	@ApiOperation(value="add student")
	public Students addStudent(@RequestBody Students student)
	{
		return service.SaveStudent(student);
	}
	
	

}
