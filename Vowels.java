package ustbatchno3.junit5testcases;

public class Vowels {

	public static void main(String[] args) {
		int count=0;
		// TODO Auto-generated method stub
		String s = "Rayona";
		
		
		 for(int i=1;i<s.length();i++) {
			 char c=Character.toLowerCase(s.charAt(i));
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
				count++;
			
		 
		 }
		 
		
	
		 System.out.println(count);
	
	}

	

	
	
}
