package com.springswagger.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springswagger.DAO.StudentRepo;
import com.springswagger.model.Students;


@Service
public class StudentServices implements IStudentServices {
	@Autowired
	StudentRepo dao;


	@Override
	public List<Students> getAllStudentDetails() {
		return (List<Students>) dao.findAll();
	}

	@Override
	public Students SaveStudent(Students student) {
		return dao.save(student);
	}

}
