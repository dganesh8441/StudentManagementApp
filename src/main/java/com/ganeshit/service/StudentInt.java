package com.ganeshit.service;

import java.util.List;

import com.ganeshit.entity.Student;

public interface StudentInt {

	public Student saveStudent(Student stu);
	public List<Student> saveAllStudent(List<Student> stu);
	public Student getStudentById(Integer id);
	public List<Student> getAllStudentById();
	public Student updateStudent(Student stu);
	public List<Student> updateAllStudent(List<Student> stu);
	public boolean deleteStudentById(Integer id);
	public boolean deleteAllStudent();
}
