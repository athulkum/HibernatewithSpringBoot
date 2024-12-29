package com.codewithathul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codewithathul.entity.Employee;
import com.codewithathul.service.EmployeeService;
import com.codewithathul.service.ResponseEmployee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/insert")
	public ResponseEmployee insertData (@RequestBody Employee employee) {
	ResponseEmployee savedemployed =	employeeService.insertData(employee);
	return savedemployed;
	}

}
