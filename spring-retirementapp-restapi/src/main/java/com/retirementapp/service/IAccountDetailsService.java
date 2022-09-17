package com.retirementapp.service;

import java.util.List;

import com.retirementapp.exception.AccountNotFoundException;
import com.retirementapp.model.AccountDetails;

public interface IAccountDetailsService {

	// CRUD Operation
	AccountDetails addAccountDetails(AccountDetails accountDetails);

	void updateAccountDetails(AccountDetails accountDetails);

	void deleteAccountDetails(int accountNo);


	AccountDetails getAccountTypeByEmployeeName(String employeeName) throws AccountNotFoundException;

	AccountDetails getBankNameByEmployeeId(Integer emplyoeeId);

	List<AccountDetails> getAll();

}
