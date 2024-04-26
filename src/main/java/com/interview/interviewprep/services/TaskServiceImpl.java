package com.interview.interviewprep.services;

import java.util.List;

import com.interview.interviewprep.Repositories.TaskRepository;
import com.interview.interviewprep.models.Employee;
import com.interview.interviewprep.models.Task;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepository;

    TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task getTask(int id) {
        return this.taskRepository.findById(id).get();
    }

    @Override
    public List<Employee> getEmployeeById(int taskID) {
       
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeeById'");
    }
    
}
