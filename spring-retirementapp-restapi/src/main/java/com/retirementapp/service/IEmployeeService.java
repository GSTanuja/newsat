package com.retirementapp.service;

import java.util.List;

import com.retirementapp.exception.EmployeeNotFoundException;
import com.retirementapp.model.Employee;

public interface IEmployeeService {

	// CRUD Operation
	Employee addEmployee(Employee employee);

	void updateEmployee(Employee employee);

	void deleteEmployee(int employeeId);

	Employee getById(int employeeId);

	List<Employee> getAll();

	List<Employee> getEmployeeByPlanName(String planName) throws EmployeeNotFoundException;

	List<Employee> getEmployeeByBankName(String bankName) throws EmployeeNotFoundException;

	List<Employee> getEmployeeByGreaterSalary(double salary) throws EmployeeNotFoundException;

}
