package com.cmc.service;

import java.util.List;

import com.cmc.model.Employee1;

public interface IEmployeeService {
	
	public List<Employee1> getAllEmployee();

	public Employee1 getEmployee(long id);

	public void addEmployee(Employee1 employee);

	public void deleteEmployee(long id);

}
