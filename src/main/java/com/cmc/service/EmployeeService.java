package com.cmc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmc.mapper.EmployeeMapper;
import com.cmc.model.Employee1;


@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private EmployeeMapper mapper;

	@Override
	public List<Employee1> getAllEmployee() {
		// TODO Auto-generated method stub
		return mapper.findAll();
	}

	@Override
	public Employee1 getEmployee(long id) {
		// TODO Auto-generated method stub
		return mapper.findById(id);
	}

	@Override
	public void addEmployee(Employee1 employee) {
		// TODO Auto-generated method stub
		mapper.add(employee);
		
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		mapper.delete(id);
		
	}

}
