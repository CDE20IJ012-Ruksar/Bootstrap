package com.cts.employee.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
@Id
private int emp_id;
private String emp_name;
private int salary;

public int getEmp_id() {
	return emp_id;
}

public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

public String getEmp_name() {
	return emp_name;
}

public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}

public float getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + emp_id;
	result = prime * result + ((emp_name == null) ? 0 : emp_name.hashCode());
	result = prime * result + Float.floatToIntBits(salary);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (emp_id != other.emp_id)
		return false;
	if (emp_name == null) {
		if (other.emp_name != null)
			return false;
	} else if (!emp_name.equals(other.emp_name))
		return false;
	if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
		return false;
	return true;
}

public Employee(int emp_id, String emp_name, int salary) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.salary = salary;
}

public Employee() {
	super();
}

}