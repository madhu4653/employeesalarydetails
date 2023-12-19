package com.commercecxsalaries.employeesalarydetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeesSalary {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String designation;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public EmployeesSalary() {
		super();
	}
	public EmployeesSalary(int id, String designation, double salary) {
		super();
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeesSalary [id=" + id + ", designation=" + designation + ", salary=" + salary + "]";
	}
}
