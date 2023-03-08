package hash;

import java.util.HashSet;
import java.util.Scanner;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j;
		HashSet<Integer> has=new HashSet<Integer>();
		HashSet<Integer> has1=new HashSet<Integer>();
		HashSet<Integer> has2=new HashSet<Integer>();
		for(i=0;i<=4;i++) {
			int a=sc.nextInt();
			has.add(a);
		}
	
		for(j=0;j<=5;j++) {
			int b=sc.nextInt();
			has1.add(b);
		}
		System.out.println(has);
		System.out.println(has1);
		if(has.retainAll(has1)) {
			System.out.println("present"+has);
		}
		else {
			System.out.println("not present"+has);
		}
	}

}
