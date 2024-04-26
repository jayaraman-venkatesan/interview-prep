package com.interview.interviewprep.services;

import com.interview.interviewprep.models.Employee;
import com.interview.interviewprep.models.Task;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    public Task getTask(int id);

    public List<Employee> getEmployeeById(int taskID);

} 
