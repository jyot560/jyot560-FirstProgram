package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;

public class EmployeeService implements EmployeeServiceImp{
     @Autowired
	EmployeeRepository employeerepository;
	@Override
	public void insertEmployee(Employee cus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployees() {
	     return (List<Employee>) employeerepository.findAll();
	}

}
