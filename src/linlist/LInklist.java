package linlist;


import java.util.*;

public class LInklist {
	public static void main(String[] args) {
	
	LinkedList<Integer> l1= new LinkedList<Integer>();
	
	Scanner sc=new Scanner(System.in);
	
	int i;
	for(i=0;i<=4;i++) {
		int a = sc.nextInt();
		l1.add(a);
		
	}

	System.out.println(l1);
	System.out.println(l1.get(i/2));
}}