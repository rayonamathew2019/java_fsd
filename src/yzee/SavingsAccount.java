package yzee;

public class SavingsAccount extends Account {
	private int minimumbalance = 1000;

	public SavingsAccount(int accountnumber, Customer customerobj, int balance, int minimumbalance) {
		super(accountnumber, customerobj, balance);
		this.minimumbalance = minimumbalance;
	}

	
	public int getMinimumbalance() {
		return minimumbalance;
	}


	public void setMinimumbalance(int minimumbalance) {
		this.minimumbalance = minimumbalance;
	}
	public boolean withdraw(double amount) {
		if(minimumbalance<amount)
		{
			balance=balance-amount;
			System.out.println("balance"+balance);
			return true;
			
			
		}
		return false;
	}
}
