package com.interview.interviewprep.services;

import com.interview.interviewprep.models.*;

import java.util.*;



public interface EmployeeService {
	
	public List<Employee> getAllEmployees();

	public String populateTable();
	
	public Boolean createEmployee(Employee e);
	
	public Employee getEmployeeByName(String name);
	
	public List<Employee> getEmployeeBySalaryRange(int salary);

}
