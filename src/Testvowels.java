package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testvowels {

	 @Test

	 public void counttesting() {

	 

	 String s ="sharath";

	 

	 int expected=2;

	 int actual=Testvowels.Countvowels(s);

	 assertEquals(expected,actual);

	 

	 }
	 public static int Countvowels(String s) {
			// TODO Auto-generated method stub
		 int count=0;
		 for(int i=1;i<s.length();i++) {
			 char c=Character.toLowerCase(s.charAt(i));
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') 
				count++;
			
		}

		 return count;
	 
	 }}
