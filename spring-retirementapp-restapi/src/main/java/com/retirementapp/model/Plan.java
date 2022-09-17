package com.retirementapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Plan {

	@Id
	@GeneratedValue(generator = "plan_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "plan_id", sequenceName = "plan_seq", initialValue = 1, allocationSize = 1)
	private Integer uanId;
	private String planName;
	private String planType;
	private double maturityAmount;
	private int term;

	@ManyToOne(cascade = CascadeType.ALL)
//	@JsonIgnore
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public Plan() {
		super();
	}

	public Plan(String planName, String planType, double maturityAmount, int term) {
		super();
		this.planName = planName;
		this.planType = planType;
		this.maturityAmount = maturityAmount;
		this.term = term;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getUanId() {
		return uanId;
	}

	public void setUanId(Integer uanId) {
		this.uanId = uanId;
	}

	public String getPlanType() {
		return planType;
	}

	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public double getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	@Override
	public String toString() {
		return "Plan [planName=" + planName + ", planType=" + planType + ", maturityAmount=" + maturityAmount
				+ ", term=" + term + "]";
	}

}
