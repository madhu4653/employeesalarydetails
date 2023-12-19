package com.commercecxsalaries.employeesalarydetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.commercecxsalaries.employeesalarydetails.entity.EmployeesSalary;
import com.commercecxsalaries.employeesalarydetails.service.EmployeeSalaryService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EmployeesSalaryController {
	@Autowired
	private EmployeeSalaryService salservice;
	
	@GetMapping("/getSalDetails/employee")
	public List<EmployeesSalary> getSalDetails() {
		return salservice.getDetails();
    }
	
	@PostMapping("/postSalDetails/employee")
	public EmployeesSalary saveSalDetails(@RequestBody EmployeesSalary employeesSalary){
		return salservice.postSalDetails(employeesSalary);
	}
}