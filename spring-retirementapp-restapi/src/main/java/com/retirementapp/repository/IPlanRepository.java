package com.retirementapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import com.retirementapp.model.Plan;

@Repository
public interface IPlanRepository extends JpaRepository<Plan, Integer> {

	@Query("FROM Plan p INNER JOIN p.employee e WHERE e.employeeName=?1")
	List<Plan> findPlanByEmployeeName(String employeeName);

	@Query("FROM Plan p inner join p.employee e where e.emplyoeeId=?1")
	List<Plan> findPlanByEmployeeId(int employeeId);

}
