package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Student1;

public interface UserRepository extends CrudRepository<Student1, Integer> {

}
