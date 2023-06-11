package com.ganeshit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganeshit.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	
}
