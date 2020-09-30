package org.mycompany.models;

import javax.persistence.*;

@Entity
@Table(name="request_log_new")
public class RequestLog {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="from_account_number")
	private String fromAccountNumber;
	
	@Column(name="to_account_number")
	private String toAccountNumber;
	
	@Column(name="from_amount")
	private String fromAmount;
	
	@Column(name="to_amount")	
	private String toAmount;
	
	@Column(name="currauncy")
	private String curruncyCode;
	
	@Column(name="date")
	private String Date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFromAccountNumber() {
		return fromAccountNumber;
	}

	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}

	public String getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}

	public String getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(String fromAmount) {
		this.fromAmount = fromAmount;
	}

	public String getToAmount() {
		return toAmount;
	}

	public void setToAmount(String toAmount) {
		this.toAmount = toAmount;
	}

	public String getCurruncyCode() {
		return curruncyCode;
	}

	public void setCurruncyCode(String curruncyCode) {
		this.curruncyCode = curruncyCode;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	@Override
	public String toString() {
		return "RequestLog [id=" + id + ", fromAccountNumber=" + fromAccountNumber + ", toAccountNumber="
				+ toAccountNumber + ", fromAmount=" + fromAmount + ", toAmount=" + toAmount + ", curruncyCode="
				+ curruncyCode + ", Date=" + Date + "]";
	}
	
	

}
