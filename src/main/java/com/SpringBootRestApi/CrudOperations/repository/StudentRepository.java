package com.SpringBootRestApi.CrudOperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootRestApi.CrudOperations.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
