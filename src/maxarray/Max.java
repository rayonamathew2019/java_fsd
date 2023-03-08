package maxarray;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the no. of elements ");
		int no=a.nextInt();
		int arr[]=new int[no];
		int max=arr[0];
		System.out.println("Enter the elements ");
		for(int i=0;i<no;i++) {
			arr[i]=a.nextInt();
		}
		for(int i=0;i<no;i++)
		{
			if(max<arr[i]) {
				
				max=arr[i];
				
			}
			
		}
		System.out.println(max+"  ");
	}

}
