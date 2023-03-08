package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicatedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> s= Arrays.asList(2,4,5,6);
		
	
		List<Integer> a=s.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
		List<Integer> b=s.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(a);
		System.out.println(b);

	}

}
