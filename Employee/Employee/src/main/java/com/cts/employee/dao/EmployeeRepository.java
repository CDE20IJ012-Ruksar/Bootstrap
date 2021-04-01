package com.cts.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.employee.bean.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}