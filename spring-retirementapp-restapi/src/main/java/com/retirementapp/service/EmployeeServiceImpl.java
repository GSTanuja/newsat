package com.retirementapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.retirementapp.model.Employee;
import com.retirementapp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	IEmployeeRepository employeeRepository;

	@Autowired
	public void setiEmployeeRepository(IEmployeeRepository iEmployeeRepository) {
		this.employeeRepository = iEmployeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	@Override
	public Employee getById(int employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> getEmployeeByPlanName(String planName) {
		return employeeRepository.findEmployeeByPlanName(planName);
	}

	@Override
	public List<Employee> getEmployeeByBankName(String bankName) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeeByBankName(bankName);
	}

	@Override
	public List<Employee> getEmployeeByGreaterSalary(double salary) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeeByGreaterSalary(salary);
	}

}
