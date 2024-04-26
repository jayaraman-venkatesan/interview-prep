package com.interview.interviewprep.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.interview.interviewprep.models.Employee;
import java.util.*;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value="SELECT * FROM employee WHERE name= ?1" , nativeQuery = true )
    public Employee findByName(String name);

    @Query(value="SELECT * FROM employee WHERE salary < ?1" , nativeQuery = true )
    public List<Employee> findBySalaryLessThan(int salary);
}
