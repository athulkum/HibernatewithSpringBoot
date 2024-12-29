package com.codewithathul.service;

import com.codewithathul.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEmployee {

	private Employee  employee;
	
	private String message;
}
