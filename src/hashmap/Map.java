package hashmap;
import java.util.HashMap;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map1=new HashMap<String,Integer>();
		map1.put("Amru",20);
		map1.put("Migha",21);
		map1.put("Shankari",22);
				System.out.println(map1);
		int age=map1.get("Amru");
		System.out.println(age);
		boolean a=map1.containsKey("Amru");
		boolean b=map1.containsKey("Rayona");
		boolean c=map1.containsValue(22);
		map1.remove("Shankari");
		System.out.println(a+""+b);
		System.out.println(c);
		System.out.println(map1);
		for(String name:map1.keySet()) {
			int value=map1.get(name);
			System.out.println(map1);
		}
	}

}
