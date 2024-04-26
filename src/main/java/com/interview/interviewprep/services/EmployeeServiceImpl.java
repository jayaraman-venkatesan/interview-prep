package com.interview.interviewprep.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.interview.interviewprep.Repositories.EmployeeRepository;
import com.interview.interviewprep.models.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	List<Employee> employees = new ArrayList<>() ;

	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}


	@Override
	public String populateTable() {

		this.createDummyData();

		try{
			this.employeeRepository.saveAll(this.employees);
			return "done";
		} catch(Exception exp) {
			return exp.getMessage();
		}
		

		
		
	}
	
	
	private void createDummyData() {
		
		Random rand = new Random(32);
		
		for(int i=0;i<10 ;i++) {
			this.employees.add(
					new Employee(i,"Employee "+i ,
							Math.abs(rand.nextInt()%25) + 15 , 
							Math.abs( rand.nextInt()%10000) 
					));
		}
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		try{
			return this.employeeRepository.findAll();
		} catch(Exception exp) {
			System.out.println(exp.getMessage());
		}
		
		return null;
		// return this.employees;
	}

	@Override
	public Boolean createEmployee(Employee e) {
		
		try {
			this.employees.add(e);
			return true;
		}
		catch(Exception exp) {
			
			return false;
			
		}
	}

	@Override
	public Employee getEmployeeByName(String name) {

		try{
			return this.employeeRepository.findByName(name);
		} catch(Exception exp) {
			System.out.println(exp.getMessage());
		}

		
		return null;
	}

	@Override
	public List<Employee> getEmployeeBySalaryRange(int salary) {

		try{
			return this.employeeRepository.findBySalaryLessThan(salary);
		} catch(Exception exp) {
			System.out.println(exp.getMessage());
		}

		return null;
		
		// return this.employees.stream().filter(e -> e.getSalary() > salary).toList();
	}

}
