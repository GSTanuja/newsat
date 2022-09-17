package com.retirementapp.service;

import java.util.List;

import com.retirementapp.exception.PlanNotFoundException;
import com.retirementapp.model.Plan;

public interface IPlanService {

	// CRUD Operation
	Plan addPlan(Plan plan);

	void updatePlan(Plan plan);

	void deletePlan(int uanId);

	// query the table
	Plan getByPlanId(int uanId);

	List<Plan> getPlanByEmployeeName(String employeeName) throws PlanNotFoundException;

	List<Plan> getPlanByEmployeeId(int emplyoeeId);

	List<Plan> getAll();

}
