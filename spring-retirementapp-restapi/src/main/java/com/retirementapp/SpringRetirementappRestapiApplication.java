package com.retirementapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.retirementapp.calculation.Calculator;
import com.retirementapp.model.AccountDetails;
import com.retirementapp.model.Employee;
import com.retirementapp.model.Plan;
import com.retirementapp.service.IAccountDetailsService;
import com.retirementapp.service.IEmployeeService;
import com.retirementapp.service.IPlanService;

@SpringBootApplication
public class SpringRetirementappRestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringRetirementappRestapiApplication.class, args);
	}

	@Autowired
	IEmployeeService employeeService;
	@Autowired
	IPlanService planService;
	@Autowired
	IAccountDetailsService accountDetailsService;

	@Autowired
	Calculator calculator;

	@Override
	public void run(String... args) throws Exception {
//
//		double maturityAmount401k = 0;
//		Double initialAmount = (double) 20000;
//		double depositAmount401k = 2000;
//		Integer duration401k = 30;
//		maturityAmount401k = calculator.maturityAmount401k(initialAmount, depositAmount401k, duration401k);
//		System.out.println(maturityAmount401k);
//
//		double maturityAmount403b = 0;
//		initialAmount = (double) 30000;
//		Integer duration403b = 35;
//		Double depositAmount403b = (double) 3000;
//		maturityAmount403b = calculator.maturityAmount403b(initialAmount, depositAmount403b, duration403b);
//		System.out.println(maturityAmount403b);
//
//		double maturityAmount457 = 0;
//		initialAmount = (double) 40000;
//		Integer duration457 = 25;
//		Double depositAmount457 = (double) 4000;
//		maturityAmount457 = calculator.maturityAmount457(initialAmount, depositAmount457, duration457);
//		System.out.println(maturityAmount457);
//
//		double maturityAmountIRA = 0;
//		initialAmount = (double) 35000;
//		Integer durationIRA = 30;
//		Double depositAmountIRA = (double) 3500;
//		maturityAmountIRA = calculator.maturityAmountIRA(initialAmount, depositAmountIRA, durationIRA);
//		System.out.println(maturityAmountIRA);
//
//		AccountDetails accountDetails = new AccountDetails("savings", "ICICI", 56745987872l);
//		AccountDetails accountDetails1 = new AccountDetails("savings", "BOB", 48565687874l);
//		Plan plan = new Plan("401k", "Qualified", maturityAmount401k, 30);
//		Plan plan1 = new Plan("IRA", "Non-Qualified", maturityAmountIRA, 30);
//		Set<Plan> planList = new HashSet<>(Arrays.asList(plan, plan1));
//		Employee employee = new Employee("Sri", 80000, accountDetails1, planList);

		// employeeService.addEmployee(employee);

		// System.out.println(accountDetailsService.getAccountTypeByEmployeeName("Akash"));
		// System.out.println(accountDetailsService.getBankNameByEmployeeId(3));
//		 System.out.println(planService.getById(1));
		// employeeService.deleteEmployee(2);
		// employeeService.deleteEmployee(4);

		// System.out.println(planService.getPlanByEmployeeId(2));

//	  System.out.println("By Plan Name");
//	  employeeService.getEmployeeByPlanName("403b").forEach(System.out::println);
//	  
//	  System.out.println("By Bank Name");
//	  employeeService.getEmployeeByBankName("HDFC").forEach(System.out::println);
//		 System.out.println("By Employee Name");
		// System.out.println (planService.getPlanByEmployeeName("Sri"));
		// employeeService.getEmployeeByGreaterSalary(30000).forEach(System.out::println);

//		
		planService.getAll().forEach(System.out::println);

	}

}
