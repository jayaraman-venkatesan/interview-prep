package com.interview.interviewprep.controllers;

import com.interview.interviewprep.models.*;
import org.springframework.web.bind.annotation.RestController;

import com.interview.interviewprep.services.TaskService;
import com.interview.interviewprep.services.TaskServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/task")
public class TaskController {

    TaskService taskService;

    TaskController(TaskServiceImpl taskServiceImpl) {
        this.taskService = taskServiceImpl;
    }

    @GetMapping("/task")
    public Task getTask(@RequestParam("id") int id) {
      return this.taskService.getTask(id);
    }
    
}
