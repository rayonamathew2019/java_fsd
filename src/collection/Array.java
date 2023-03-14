Write a program to add elements to a list and get familiarize with various operations using the list in java 8?


package collection;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list11= new ArrayList<String>();
		list11.add("Mango");//Adding object in arraylist    
	     list11.add("Apple");    
	     list11.add("Banana");    
	     list11.add("Grapes");    
	        
	     Iterator itra=list11.iterator();
	      System.out.println(list11);  
	     while(itra.hasNext()){//check if iterator has the elements  
	    	   System.out.println(itra.next());//printing the element and move to next  
	    	   
	    	  }  
	   //Traversing list through for-each loop  
	     for(String fruit:list11)    
	       System.out.println(fruit);    
	     System.out.println("Returning element: "+list11.get(1));//it will return the 2nd element, because index starts from 0  
// 	     changing the element  
	     list11.set(1,"Dates");  
	     //Traversing list  
	     for(String fruit:list11)    
	       System.out.println(fruit);    
	}

}
