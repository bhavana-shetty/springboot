package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDAO employeeDao;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}


	@Transactional
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}


	@Transactional
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		 employeeDao.save(employee);
	}

	@Transactional
	@Override
	public Employee find(int theId) {
		return employeeDao.find(theId);	}

	@Transactional
	@Override
	public List<Employee> findByEmail(String theEmail) {
		
		return employeeDao.findByEmail(theEmail);
	}


	@Override
	public void delete(int theId) {
		employeeDao.delete(theId);
		
	}

}
