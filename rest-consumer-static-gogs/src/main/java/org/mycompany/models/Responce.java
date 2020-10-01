package org.mycompany.models;

public class Responce {
	private String fromAccountNumber;
	private String fromBalance;
	private String toBalance;
	private String journalReferance;
	public String getFromAccountNumber() {
		return fromAccountNumber;
	}
	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}
	public String getFromBalance() {
		return fromBalance;
	}
	public void setFromBalance(String fromBalance) {
		this.fromBalance = fromBalance;
	}
	public String getToBalance() {
		return toBalance;
	}
	public void setToBalance(String toBalance) {
		this.toBalance = toBalance;
	}
	public String getJournalReferance() {
		return journalReferance;
	}
	public void setJournalReferance(String journalReferance) {
		this.journalReferance = journalReferance;
	}
}
