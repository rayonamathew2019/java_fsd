package meals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
//	String ch=sc.nextLine();
//		List<Curdfood> list1=Array.asList("45356","hgfgfhh");
		Curdfood c1=new Curdfood("23245","dfgdf","vegmeals=80");
		Curdfood c2=new Curdfood("23423","dfssg","fishcurry=120");
		Curd c3=new Curd("23245","dfgdf");
		Curd c4=new Curd("23423","dfssg");

		List<Curdfood> list1=Arrays.asList(c1,c2);
		List<Curd> list2=Arrays.asList(c3,c4);
		List<String> list3= new ArrayList();
		List<String> list4= new ArrayList();
		List<List<String>> allproducts = new ArrayList<List<String>>();   
		list3.add("vegmeals=80");
		list3.add("fishcurry=120");
		list3.add("veg fried rice=60");
		list4.add("1");
		list4.add("2");
		list4.add("3");
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"vegmeals=80");
		map1.put(2,"fishcurry=120 ");
		map1.put(3,"veg fried rice=60");
		String ch=sc.nextLine();
		for(Integer name:map1.keySet()) {
			String value=map1.get(name);
			
		}
		System.out.println(map1);
		List<List<String>> list5=allproducts.stream().collect(Collectors.toList());
		
		
		
		
		System.out.print("\n"+list2);
		System.out.print("\n"+list1)
		System.out.print("\n"+list3);
		

	}

}
