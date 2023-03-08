package collec;
import java.util.*;
public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList <Integer>list2=new ArrayList<Integer>();
		int i,j;
		int count=0;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<=10;i++) {
			int a = sc.nextInt();
			
		list2.add(a);
		}
		System.out.println(list2);
		for(i=0;i<=10;i++) {
			for(j=i+1;j<10;j++) {
				if(list2.get(i)+list2.get(j)==25) {
					count++;
					
					
				}}}
			if(count==1)
			{
				System.out.println("Present");
			}
			else {
				System.out.println("not Present");
			}
			
			
		
		
		
		
			
		
		
		
		
	}

}
