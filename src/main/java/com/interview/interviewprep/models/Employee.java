package com.interview.interviewprep.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {
	
	@Id
    @Column(name = "id")
	Integer id;
	
	@Column(name= "name")
	String name;
	
	@Column(name= "age")
	int age;
	
	@Column(name= "salary")
	int salary;


	public Employee() {
		
	}
	
	public Employee(Integer id ,  String name, int age, int salary){

		this.id = id;
		
		this.name = name;
		
		this.age = age;
		
		this.salary = salary;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public int getAge() {
		
		return this.age;
		
	}

	public int getSalary() {
		return this.salary;
	}
	

}
