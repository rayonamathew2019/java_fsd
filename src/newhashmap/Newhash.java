package newhashmap;

import java.util.HashMap;

public class Newhash {

	public Newhash(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Employee> map2=new HashMap<Integer,Employee>();
		Employee e1=new Employee("245072","Rayona",22,"cs");
		Employee e2=new Employee("245078","Ammu",23,"Ec");
		map2.put(1,e1);
		map2.put(2,e2);
//		map2.put(3,new Employee("245038","Appu",25,"Cse"));
		
		 
//		int hashcodevalue=has2.hashCode();
		System.out.println(map2);

	}

}
