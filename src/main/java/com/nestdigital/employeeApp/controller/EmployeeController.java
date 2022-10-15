package com.nestdigital.employeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Page(){
        return "Hi";
    }

    @GetMapping("/home")
    public String Homepage(){
        return "Welcome to my Homepage";
    }


    @GetMapping("/addemployee")
    public String Addemployee(){
        return  "Add Employee";
    }

    @GetMapping("/searchemployee")
    public String Searchemployee(){
        return "Search Employee";
    }


    @GetMapping("/deleteemployee")
    public String Deleteemployee(){
        return "Delete Employee";
    }
}
