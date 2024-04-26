package com.interview.interviewprep.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.interview.interviewprep.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{


    @Query(value="SELECT * FROM task WHERE task= ?1" , nativeQuery = true )
    public Task findByTask(String task);



    
}
