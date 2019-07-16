package com.springswagger.DAO;

import org.springframework.data.repository.CrudRepository;

import com.springswagger.model.Students;


public interface StudentRepo extends CrudRepository<Students,Integer> {

}
