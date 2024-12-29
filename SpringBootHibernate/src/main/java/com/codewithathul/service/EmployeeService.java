package com.codewithathul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.codewithathul.entity.Employee;
import com.codewithathul.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public ResponseEmployee insertData(Employee employee) {
		if(employee.getSalary()>50000) {
	Employee savedemployee =	employeeRepository.save(employee);
	return new ResponseEmployee(savedemployee,"Employedd successfully");
	}else {
	//	throw new lessSalaryExcpetion("salary cant be less than 50000");
		
	return new ResponseEmployee(null,"salary should be 50000");
	}

}
}