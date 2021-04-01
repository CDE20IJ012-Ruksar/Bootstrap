package com.cts.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.employee.bean.Employee;
import com.cts.employee.service.EmployeeService;

@RestController

@RequestMapping("/api/employee")
public class EmployeeController {

@Autowired
private EmployeeService employeeService;

@PostMapping("/addEmployee")
public Employee addEmployee(@RequestBody Employee employee) {
	employeeService.addEmployee(employee);
	return employee;
}

}
