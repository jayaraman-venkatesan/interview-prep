package com.interview.interviewprep.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    int id;

    String task;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emp_id")
    Employee employee;

    public Task() {
    }

    public Task(Employee e , int id, String task) {
        this.id = id;
        this.task = task;
        this.employee = e;
    }

    public String getTask() {
        return this.task;
    }

    public Employee getEmployee() {
        return this.employee;
    }
    
}
