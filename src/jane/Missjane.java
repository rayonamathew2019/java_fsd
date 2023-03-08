/*package jane;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Missjane {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	String s1=sc.next();
	String[] s2=s1.split("[\\s,:;!.?]+");
//	 List<String> splitData2=Arrays.asList(s2);
	List<String> words=Arrays.stream(s2).filter(t->!t.isEmpty()).collect(Collectors.toList());

	List<String> unique=words.stream().map(t->t.toLowerCase()).distinct().sorted().collect(Collectors.toList());
	
	System.out.println(words.size());
	
	
	
}	
}*/
package jane;
import java.util.stream.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Missjane
{
public static void main(String args[])
{
	System.out.println("Enter String:");
	Scanner sc=new Scanner(System.in);
	String r=sc.nextLine();
	sc.nextLine();
	String v=r.replaceAll("[',!*@;']"," ");
	String [] q=v.split(" ");
	List<String>a=Arrays.asList(q);
	List<String>w=a.stream().map(t->t.toLowerCase()).distinct().sorted().toList();
	System.out.println(w.size());
	System.out.println(a.size());
	w.forEach(System.out::println);
}
}