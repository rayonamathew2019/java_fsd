package hotel;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Customer c1=new Customer("124","adsfa","435525","dfer@dsf");
		Customer c2=new Customer("211","casds","2141455","fgvdfh");
		Customer c3=new Customer("321","edfraf","1411243","dfcdsgs");
		List<Customer> clist=Arrays.asList(c1,c2,c3);
		String a=sc.next();
		Customer c=clist.stream().filter(findEmp->a.equals(findEmp.getRegi())).findAny().orElse(null);
		System.out.println(c);
		sc.close();
	}

}
