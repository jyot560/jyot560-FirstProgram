package net.guides.springboot2.springboot2jpacrudexample.service;

import java.util.List;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;

public interface EmployeeServiceImp {
	void insertEmployee(Employee cus);
	List<Employee> getAllEmployees();

}
