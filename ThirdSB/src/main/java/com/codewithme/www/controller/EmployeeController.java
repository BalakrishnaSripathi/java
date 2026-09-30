package com.codewithme.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codewithme.www.model.Employee;
import com.codewithme.www.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeRepository;
	
	@RequestMapping("/home")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/addEmp")
	public String createEmployee(Employee employee) {
		employeRepository.save(employee);
		return "index.jsp";
	}
}
