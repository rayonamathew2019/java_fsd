package yzee;

public class Customer {
	
	private int customerid;
	private String customername;
	private String emailid;
	public Customer(int customerid,String customername,String emailid)
	
	{
		super();
		this.customerid=customerid;
		this.customername=customername;
		this.emailid=emailid;
	}
	public int getCustomerid() {
		return customerid;
	}
	
	public String getCustomername() {
		return customername;
	}
	
	public String getEmailid() {
		return emailid;
	}
	



}

