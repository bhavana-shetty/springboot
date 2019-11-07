package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployee();
	}

	public EmployeeRestController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@PostMapping("/employees")
	public Employee save(@RequestBody Employee employee) {
		employeeService.save(employee);
		return employee;
		
	}
	
	@PutMapping("/employees")
	public void update(@RequestBody Employee employee) {
		employeeService.save(employee);
		
		
	}
	
	@GetMapping("/employees/{theId}")
	public Employee find(@PathVariable int theId) {
		return employeeService.find(theId);
	}
	
	@GetMapping("/employees/find/{theEmail}")
	public List<Employee> findByEmail(@PathVariable String theEmail){
		return employeeService.findByEmail(theEmail);
	}
	
	@DeleteMapping("/employees/{theId}")
	public void delete(@PathVariable int theId) {
		employeeService.delete(theId);
	}

}
