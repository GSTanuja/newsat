package com.retirementapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {
	private String employeeName;

	@Id
	@GeneratedValue(generator = "employee_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "employee_id", sequenceName = "employee_seq", initialValue = 1, allocationSize = 1)
	private Integer emplyoeeId;
	private double salary;
//	 @JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id")
	private AccountDetails accountDetails;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "employee")
	private Set<Plan> planList;

	public Employee() {
		super();
	}

	public Employee(String employeeName, double salary, AccountDetails accountDetails, Set<Plan> planList) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.accountDetails = accountDetails;
		this.planList = planList;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmplyoeeId() {
		return emplyoeeId;
	}

	public void setEmplyoeeId(Integer emplyoeeId) {
		this.emplyoeeId = emplyoeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	public Set<Plan> getPlanList() {
		return planList;
	}

	public void setPlanList(Set<Plan> planList) {
		this.planList = planList;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary + ", accountDetails=" + accountDetails
				+ ", planList=" + planList + "]";
	}

}
