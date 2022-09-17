package com.retirementapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.retirementapp.model.Employee;
import com.retirementapp.service.IEmployeeService;

//@CrossOrigin("http://localhost:4200")
//@RestController
//@RequestMapping("/employees-restapi")
public class EmployeeController {

	@Autowired
	IEmployeeService employeeService;

	@PostMapping("/employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee newEmployee = employeeService.addEmployee(employee);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "one employee added");
		return ResponseEntity.ok().headers(headers).body(newEmployee);
	}

	@PutMapping("/employees")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		HttpHeaders headers = new HttpHeaders();
		return ResponseEntity.ok("updated");
	}

	@DeleteMapping("/employees/id/{employeeId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("employeeId") int employeeId) {
		employeeService.deleteEmployee(employeeId);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/employees/employeeId/{employeeId}")
	public Employee getById(@PathVariable("employeeId") int employeeId) {
		return employeeService.getById(employeeId);
//				return ResponseEntity.ok().build();
	}

	@GetMapping("/employees/getall")
	public ResponseEntity<List<Employee>> getAll() {
		List<Employee> employees = employeeService.getAll();
		HttpHeaders headers = new HttpHeaders();

		ResponseEntity<List<Employee>> responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);
		return responseEntity;
	}

	@GetMapping("/employees/planname/{planName}")
	public ResponseEntity<List<Employee>> getEmployeeByPlanName(@PathVariable("planName") String planName) {
		List<Employee> employeeList = employeeService.getEmployeeByPlanName(planName);
		return ResponseEntity.ok().body(employeeList);
	}

	@GetMapping("/employees/bankname/{bankName}")
	public ResponseEntity<List<Employee>> getEmployeeByBankName(@PathVariable("bankName") String bankName) {
		List<Employee> employeeList = employeeService.getEmployeeByBankName(bankName);
		return ResponseEntity.ok().body(employeeList);
	}

}
