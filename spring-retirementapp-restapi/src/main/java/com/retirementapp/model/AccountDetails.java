package com.retirementapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class AccountDetails {

	@Id
	@GeneratedValue(generator = "account_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "account_gen", sequenceName = "account_seq", initialValue = 1, allocationSize = 1)
	private Integer accountId;
	private String accountType;
	private String bankName;
	private long accountNo;

	public AccountDetails() {
		super();
	}

	public AccountDetails(String accountType, String bankName, long accountNo) {
		super();
		this.accountType = accountType;
		this.bankName = bankName;
		this.accountNo = accountNo;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	@Override
	public String toString() {
		return "AccountDetails [accountType=" + accountType + ", bankName=" + bankName + ", accountNo=" + accountNo
				+ "]";
	}
}
