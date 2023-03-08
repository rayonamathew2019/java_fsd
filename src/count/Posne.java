package count;

public class Posne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,-4,6,8,-9,0,4,-7,56};
		int count=0;
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
				
			}
		
		else if(arr[i]>0) {
			flag++;
		
		}
		}
		System.out.println("number of negative " +count);
		System.out.println("number of positive" +flag);
		
		
		
	}

}
