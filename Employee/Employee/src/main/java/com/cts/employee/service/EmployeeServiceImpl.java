package com.cts.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.employee.bean.Employee;
import com.cts.employee.dao.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
private EmployeeRepository employeeRepository;

@Override
public Employee addEmployee(Employee employee) {
	// TODO Auto-generated method stub
	return employeeRepository.save(employee);
}

}
