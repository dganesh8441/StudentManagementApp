package com.ganeshit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganeshit.entity.Student;
import com.ganeshit.repository.StudentRepository;
@Service
public class StudentImpl implements StudentInt {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student stu) {
		Student save = studentRepository.save(stu);
		return save;
	}

	@Override
	public List<Student> saveAllStudent(List<Student> stu) {
		List<Student> saveAll = studentRepository.saveAll(stu);
		return saveAll;
	}

	@Override
	public Student getStudentById(Integer id) {
		Student studentById = studentRepository.findById(id).get();
		return studentById;
	}

	@Override
	public List<Student> getAllStudentById() {
		List<Student> findAllStudent = studentRepository.findAll();
		return findAllStudent;
	}

	@Override
	public Student updateStudent(Student stu) {
		Student updateStudent = studentRepository.save(stu);
		return updateStudent;
	}

	@Override
	public List<Student> updateAllStudent(List<Student> stu) {
		List<Student> updateAllStudent = studentRepository.saveAll(stu);
		return updateAllStudent;
	}

	@Override
	public boolean deleteStudentById(Integer id) {
		boolean existsById = studentRepository.existsById(id);
		if(existsById) {
			studentRepository.deleteById(id);
			return true;
		}else {
		return false;
		}
	}

	@Override
	public boolean deleteAllStudent() {
		List<Student> findAll = studentRepository.findAll();
		if(findAll != null) {
			studentRepository.deleteAll();
			return true;
		}else {
		return false;
		}
	}


}
