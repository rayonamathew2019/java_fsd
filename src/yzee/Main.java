package yzee;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Customer c= new Customer(123,"has","dfdsf");
		SavingsAccount s= new SavingsAccount(456,c,5000,674);
		System.out.println(s.withdraw(1000));
	}
	
}
