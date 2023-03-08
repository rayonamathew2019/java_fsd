package yzee;

public abstract class Account {

	protected int accountnumber;
	protected Customer customerobj;
	protected double balance;
	public Account(int accountnumber, Customer customerobj, int balance) {
		super();
		this.accountnumber = accountnumber;
		this.customerobj = customerobj;
		this.balance = balance;
	}
	
	


	public int getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}


	public Customer getCustomerobj() {
		return customerobj;
	}


	public void setCustomerobj(Customer customerobj) {
		this.customerobj = customerobj;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	abstract public boolean withdraw(double amount);
		
		
		
		
	

}
