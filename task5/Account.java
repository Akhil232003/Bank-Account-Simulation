package task5;

import java.util.ArrayList;

public class Account {
	private String accountatName;
	private String accountNumber;
	private double balance;
	
	private ArrayList al=new ArrayList();

	public Account(String accountatName, String accountNumber, double balance) {
		super();
		this.accountatName = accountatName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		al.add("Account is created...");
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("Deposited "+amount+" successfully");
			al.add(amount+" rupees deposited..");
		}
		else {
			System.out.println("amount is less than zero..");
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			balance=balance-amount;
			System.out.println(amount+" rupees withdraw successfully..");
			al.add(amount+" withdrawed from your account..");
		}
		else {
			System.out.println("Enter a valid amount..");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void displayTransactionHistory() {
		for (Object history : al) {
			System.out.println(history);
		}
	}
	
	
	public String getAccountatName() {
		return accountatName;
	}

	public void setAccountatName(String accountatName) {
		this.accountatName = accountatName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void displayAccountDetails() {
		System.out.println("---------------Account Details-----------------");
		System.out.println("Account Holder Name is :"+getAccountatName());
		System.out.println("Account Number is :"+getAccountNumber());
		System.out.println("Balance is :"+getBalance());
	}
	
	
}
