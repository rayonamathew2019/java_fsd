package kfgb;

public class Currentaccount extends Account implements Maintanancecharge {
	public Currentaccount(String accountnumber, String customername, double balance) {
		super(accountnumber, customername, balance);
		// TODO Auto-generated constructor stub
	}
	
	public float calculateMaintanancecharge(float numberofyears) {
	int m=200;
	float maintanancecharge=(numberofyears*m)+50;
	System.out.println("Main saving");
	return maintanancecharge;
	
	}
}
