package com.cmc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.model.Employee1;
import com.cmc.service.IEmployeeService;

@RequestMapping("/home")
@CrossOrigin(origins = "*")
@RestController
public class home {
	
	@Autowired
	private IEmployeeService service;
	
	@GetMapping()
	public ResponseEntity<?> getAll(){
		List<Employee1> lists = service.getAllEmployee();
		if(lists.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<>(lists, HttpStatus.OK);
		}
	}
	
	@PostMapping("/create-employee")
	public ResponseEntity<?> createEmployee(@RequestBody Employee1 employee) {
		service .addEmployee(employee);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
