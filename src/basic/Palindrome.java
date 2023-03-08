package basic;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int temp,num1;
		int sum=0;
		while(num>0) {
			num1=num%10;
			sum=(sum*10)+num1;
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
