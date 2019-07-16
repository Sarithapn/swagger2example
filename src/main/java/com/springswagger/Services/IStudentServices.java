package com.springswagger.Services;

import java.util.List;

import com.springswagger.model.Students;

public interface IStudentServices {

	List<Students> getAllStudentDetails();

	Students SaveStudent(Students student);

}
