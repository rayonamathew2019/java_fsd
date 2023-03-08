package kfgb;

public class Savings extends Account implements Maintanancecharge{
	
	public Savings(String accountnumber, String customername, double balance) {
		super(accountnumber, customername, balance);
		// TODO Auto-generated constructor stub
	}
	public float calculateMaintanancecharge(float numberofyears) {
	int m=50;
	float maintanancecharge=(numberofyears*m)+200;
	System.out.println("Main saving");
	return maintanancecharge;
	
	}
}
