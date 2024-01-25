package com.SpringBootRestApi.CrudOperations.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.SpringBootRestApi.CrudOperations.model.Student;
import com.SpringBootRestApi.CrudOperations.repository.StudentRepository;
import com.SpringBootRestApi.CrudOperations.service.StudentService;

@Component
@Service

public class StudentServiceimpl implements StudentService {
	
	@Autowired
	StudentRepository r;

	@Override
	public Student saveStudent(Student student) {
	Student s1 =r.save(student);
	return s1;
		}

	@Override
	public List<Student> findAllStudent() {
		List<Student> findstudent = r.findAll();
		return findstudent;
	}


	@Override
	public void deleteStudent(int id) {
		r.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Student student) {
	 Optional<Student> studentObj = r.findById(student.getId());
	 Student student2=null;
	 if(studentObj.isPresent())
	 {
		 student2 = studentObj.get();
		 student2.setName(student.getName());
		 student2.setEmailId(student.getEmailId());
		 student2.setCurrentAddress(student.getCurrentAddress());
		 student2.setMobileNo(student.getMobileNo());
		 student2.setId(student.getId());
		 
		 
	 }
	 r.save(student2);
	 
		return student2;
	}
	

}
