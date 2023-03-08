package employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Empclass {

	public static void main(String[] args) {
		Emptable m1=new Emptable("123", "Rayona", 200000);
		Emptable m2=new Emptable("113", "Migha", 2000);
		Emptable m3=new Emptable("103", "Amru", 70000);
		List<Emptable> list=Arrays.asList(m1,m2,m3);
		List<Emptable> lis = list.stream().sorted(Comparator.comparing(Emptable::getSalary).reversed())
				.peek(k->{
				if((k.getSalary()>=50000)&&(k.getSalary()<100000))
					k.setSalary(k.getSalary()+(0.1)*k.getSalary());
				else if(k.getSalary()>=100000)
					k.setSalary(k.getSalary()+(0.05)*k.getSalary());}
			      ).toList();
				
		
					 
		System.out.println(lis);
		
	}

}
