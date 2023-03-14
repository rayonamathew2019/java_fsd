write a program to print the cummulative sum in java?


package array;

import java.util.*;
public class Cummulative {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int ch=sc.nextInt();
		int i;
		System.out.println("Enter the elements:");
		int arr[]= new int[ch];
		int array[] = new int[ch];
		int sum=0;
		for(i=0;i<ch;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			array[i]=sum;
		}
		for(i=0;i<ch;i++) {
			System.out.println(array[i]+" ");
		}
			
		}
		
	}


