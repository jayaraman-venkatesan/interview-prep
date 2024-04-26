package com.interview.interviewprep.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("/api/home")
public class HomePageController {
    

    @GetMapping("/{name}") 
    public String homepage(@PathVariable("name") String name){
    	
    	return "Welcome to this application "+ name.toUpperCase();
        
    }


}
