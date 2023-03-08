package lucky;
import java.util.*;
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int num=a.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[num];
		int array= 369;
		int sum=0;
		int count1=0;
		int count2=0;
		int count3=0;

		
		for(int i=0;i<num;i++)
		{
			arr[i]=a.nextInt();
	
		}
		for(int i=0;i<num;i++)
		{
			if(arr[i]==3) {
				count1=1;
				
			}
			if(arr[i]==6) {
				count2=1;
				
			}
			if(arr[i]==9) {
				count3=1;
				
			}
			
		}
		if(count1==1&&count2==1&&count3==1) {
		System.out.println("lucky");
	
	}
		else
		{
			System.out.println("not lucky");
		}
	}
}
