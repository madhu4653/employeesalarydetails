package com.commercecxsalaries.employeesalarydetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.commercecxsalaries.employeesalarydetails.entity.EmployeesSalary;

@Repository
public interface EmployeeSalaryRepo extends JpaRepository<EmployeesSalary,Integer>{
	
	

}
