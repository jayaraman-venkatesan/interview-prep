package com.interview.interviewprep.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.interview.interviewprep.models.Employee;

import com.interview.interviewprep.services.EmployeeService;
import com.interview.interviewprep.services.EmployeeServiceImpl;

import java.util.List;
 

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {
	
	private EmployeeService empService;
	
	public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
		
		this.empService = employeeServiceImpl;
		
	}
	
	
	@GetMapping("/employees")
	public List<Employee> getAllEmp(){
		return this.empService.getAllEmployees();
	}


	@GetMapping("/addAll")
	public String populate(){

		return this.empService.populateTable();
	}
	
	@GetMapping("/search")
	public Employee searchByName(@RequestParam("name") String name){
		
		return this.empService.getEmployeeByName(name);
		
	}
	
	@GetMapping("/searchBySal")
	public List<Employee> searchBySalaryRange(@RequestParam("salary") int sal){
		
		return this.empService.getEmployeeBySalaryRange(sal);
		
	}
	
	

}
