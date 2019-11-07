package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	public EmployeeDAOImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		Query query = entityManager.createQuery("From Employee");
		return query.getResultList();
	}

	@Override
	public void save(Employee employee) {
		Employee theEmployee = entityManager.merge(employee);
		employee.setEmployee_id(theEmployee.getEmployee_id());

	}

	@Override
	public Employee find(int theId) {
		Employee employee = entityManager.find(Employee.class, theId);
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findByEmail(String theEmail) {
		Query query = entityManager.createQuery("from Employee e where e.email =:theEmail", Employee.class);
		query.setParameter("theEmail", theEmail);
		return query.getResultList();

	}

	@Override
	public void delete(int theId) {
		Employee employee = entityManager.find(Employee.class, theId);
		if (employee != null) {
			entityManager.remove(employee);
		} else {
			throw new RuntimeException("Employee with the id= " + theId + " not found");
		}

	}

}
