package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Employee;
import com.example.crud.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
@Autowired
private EmployeeServiceImpl emp;
@GetMapping("/")
public Employee get() {
	Employee t1 = emp.t1();
	return t1;
	
}
}
