package com.commercecxsalaries.employeesalarydetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.commercecxsalaries.employeesalarydetails.entity.EmployeesSalary;
import com.commercecxsalaries.employeesalarydetails.repository.EmployeeSalaryRepo;

@Service
public class EmployeeSalaryService {
	
	@Autowired
	private EmployeeSalaryRepo salRepo;
	public List<EmployeesSalary> getDetails() {
		List<EmployeesSalary> employeeSal=salRepo.findAll();
		return employeeSal;
	}
    
	public EmployeesSalary postSalDetails(EmployeesSalary employeesSalary) {
		return salRepo.save(employeesSalary);
	}
}
