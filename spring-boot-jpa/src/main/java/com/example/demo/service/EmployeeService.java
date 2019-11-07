package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	public void save(Employee employee);
	public Employee find(int theId);
	public List<Employee> findByEmail(String theEmail);
	public void delete(int theId);
}
