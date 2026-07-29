package com.example.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.repository.S_Repository;
import com.example.crud.student.Student;

@Service
public class S_Service {
	@Autowired
	S_Repository sr;
	
//	Save method
	public Student S_Insert(Student st) {
		return sr.save(st);
		
	}
	
//	SaveAll
	public List<Student> S_Insert2(List<Student> st2) {
		return sr.saveAll(st2);
		
	}
	
//	Feindall
	public List<Student> S_fetch(){
		return sr.findAll();
	}
	
//	FindById
//	public Student S_findbymail(Integer mail)
//	public Student S_findbyAge(Integer age)

	public Object S_findbyId(Integer id) {
		Optional<Student> e = sr.findById(id);
	    if(e.isPresent()) {
	        return e.get();
	    } else {
	        return "Student ID not found";
	    }
	}
	
	public Object S_lessthanId(Integer Id) {
		List<Student> stu = sr.findStudentLessThanIdCustomList(Id);
		if(stu != null && !stu.isEmpty()) {
			return stu;
		}else {
			return "Student Ids are empty";
		}	
	}

	public Object StudentsBetweenIds(Integer startId, Integer endId) {
		List<Student> students = sr.findByIdBetween(startId, endId);
	    
	    if (students != null && !students.isEmpty()) {
	      return students;
	    } else {
	        return "student ID not exists";
	    }
    }
	
//	update
	public Object S_updateEntire(Integer id,Student req) {
		Optional<Student> stOptional = sr.findById(id);

	    if (stOptional.isPresent()) {
	        Student st = stOptional.get(); 

	        if (req.getS_name() != null) {
	            st.setS_name(req.getS_name());
	        }
	        if (req.getS_num() != null) {
	            st.setS_num(req.getS_num());
	        }

	        sr.save(st);
	        
	        return "Data is partially updated";
	    } else {

	        return "Data does not exist"; 
	    }
	}
	
//	DeleteAll
	public String S_delete() {
		sr.deleteAll();
		return "All Data is deleted";
	}
	
//	DeleteById
	public String S_DeleteBy(Integer id) {
		Student student = sr.findById(id).orElse(null);
		
		if (student == null) {
			return "id not present";
		}
		
		sr.deleteById(id);
		return "Student deleted successfully";
	}
}
