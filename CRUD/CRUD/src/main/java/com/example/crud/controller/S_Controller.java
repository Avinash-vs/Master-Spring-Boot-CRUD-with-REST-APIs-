package com.example.crud.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.crud.service.S_Service;
import com.example.crud.student.Student;

@RestController
public class S_Controller {
	@Autowired
	S_Service S2;
	
	@PostMapping("/S_reg")
	public String S_save(@RequestBody Student st2) {
		S2.S_Insert(st2);
		return "Data inserted sucessfully";
	}
	
	@PostMapping("/S_reg2")
	public String S_saveall(@RequestBody List<Student> st2) {
		S2.S_Insert2(st2);
		return "Alldata inserted sucessfully";
	}
	
	@GetMapping("/FindAll")
	public List<Student> S_fetch() {
		return S2.S_fetch();	
	}
	
	@GetMapping("/FindBy_Id/{id}")
	public Student S_loadid(@PathVariable Integer id){
		return S2.S_fetchby(id);
	}
	
//update
//	@PutMapping("modifie/{id}")
	@PatchMapping("smallupdate/{id}")
	public String S_update(@PathVariable Integer id,@RequestBody Student req) {
		S2.S_updateEntire(id, req);

		return "Data is partialy updated";
	}
	
//	Delete
	@DeleteMapping("/all")
	public String S_remove() {
		return S2.S_delete();
		  
	}
	
//	DeleteById
	@DeleteMapping("/remove/{id}")
	public String S_deletebyid(@PathVariable Integer id) {
		return S2.S_DeleteBy(id);
			 
	}
}
