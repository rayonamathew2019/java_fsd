/*package yzee;
import java.util.*;

import kfgb.Currentaccount;
import kfgb.Maintanancecharge;
import kfgb.Savings;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		System.out.println("enter account number");
		String num=sc.next();
		System.out.println("enter the customer name");
		String name= sc.next();
		System.out.println("balance");
		double balance=sc.nextInt();
		System.out.println("number of years");
		int numberofyears=sc.nextInt();
		
		Maintanancecharge s = new Currentaccount(num,name,balance);
		
	    Maintanancecharge y = new Savings(num,name,balance);
	    if(ch==1) {
	    	System.out.println(s.calculateMaintanancecharge(numberofyears));
	    }
	    
	    else
	    {
	    	System.out.println(y.calculateMaintanancecharge(numberofyears));
	    }
	}

}*/
