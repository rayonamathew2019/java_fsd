package multi;

public class Dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studdents= {"Alice","bob","charlie","david","eva"};
		int[][] marks= {{80,75,90}, {85,70,95},{90,80,85},{75,90,80},{75,80,95}};
		int[][] tomar=new int[3][5];
		int arr=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				
			
				System.out.print(marks[i][j]+ " ");
				
			}
			System.out.println();
			
		}
		
		
	}

}
