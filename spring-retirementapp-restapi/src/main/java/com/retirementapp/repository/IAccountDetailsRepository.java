package com.retirementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.retirementapp.model.AccountDetails;

@Repository
public interface IAccountDetailsRepository extends JpaRepository<AccountDetails, Integer> {
    
	
	
@Query(value="select * from employee  inner join account_details  on account_details.account_id= employee.account_id where  employee.employee_name=?1 ",nativeQuery = true)
AccountDetails findAccountTypeByEmployeeName(String employeeName);

@Query(value="select * from account_details  inner join employee on account_details.account_id= employee.account_id where  employee.emplyoee_id=?1 ",nativeQuery = true)
AccountDetails findBankNameByEmployeeId(Integer emplyoeeId);
	
}
