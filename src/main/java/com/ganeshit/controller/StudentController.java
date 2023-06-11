package com.ganeshit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ganeshit.entity.Student;
import com.ganeshit.service.StudentImpl;

@RestController
public class StudentController {

	@Autowired
	public StudentImpl studentImpl;
	
	@PostMapping("/saveAStudent")
//			, consumes = {"application/xml","application/json"})
	public ResponseEntity<Student> saveAStudent(@RequestBody Student stu){
		Student saveStudent = studentImpl.saveStudent(stu);
		return new ResponseEntity<Student>(saveStudent,HttpStatus.CREATED);
		
	}
	@PostMapping(value = "/saveAllStudents", consumes = {"application/xml","application/json"})
	public ResponseEntity<List<Student>> saveAllStudents(@RequestBody List<Student> stu){
		List<Student> saveAllStudent = studentImpl.saveAllStudent(stu);
		return new ResponseEntity<List<Student>>(saveAllStudent,HttpStatus.CREATED);
	}
	@GetMapping(value = "/getAStudentById", produces = {"application/xml","application/json"})
	public ResponseEntity<Student> getAStudentById(@PathVariable Integer id){
		Student studentById = studentImpl.getStudentById(id);
		return new ResponseEntity<Student>(studentById,HttpStatus.OK);
		
	}
	@GetMapping(value = "/getAllStudents", produces = {"application/xml","application/json"})
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> allStudentById = studentImpl.getAllStudentById();
		return new ResponseEntity<List<Student>>(allStudentById,HttpStatus.OK);
	}
	
	@PutMapping(value="/updateAStudent",consumes = {"application/xml","application/json"})
	public ResponseEntity<Student> updateAStudent(@RequestBody Student stu){
		Student updateStudent = studentImpl.updateStudent(stu);
		return new ResponseEntity<Student>(updateStudent,HttpStatus.CREATED);
		
	}
	
	@PutMapping(value="/updateAllStudents",consumes = {"Application/xml","application/json"})
	public ResponseEntity<List<Student>> updateAllStudents(@RequestBody List<Student> stu){
		List<Student> updateAllStudent = studentImpl.updateAllStudent(stu);
		return new ResponseEntity<List<Student>>(updateAllStudent,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public ResponseEntity<String> deleteStudentById(Integer id){
		boolean deleteStudentById = studentImpl.deleteStudentById(id);
		if(deleteStudentById) {
			return new ResponseEntity<String>("id deleted",HttpStatus.OK);
		}else {
		return new ResponseEntity<String>("id not deleted",HttpStatus.OK);
		}
	}
	
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll(){
		boolean deleteAllStudent = studentImpl.deleteAllStudent();
		if(deleteAllStudent) {
			return new ResponseEntity<String>("All id deleted", HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("Allid  not deleted", HttpStatus.OK);
		}
	}	
}