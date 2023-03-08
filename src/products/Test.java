package products;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		super (String proname, int proid, int proprice);
		Deatils d1= new Deatils("Bread",654,10067);
		Deatils d2= new Deatils("Bun",895,20067);
		Deatils d3= new Deatils("Butter",432,1006);
List<Deatils> d=new ArrayList<Deatils>();
d.add(d1);
d.add(d2);
d.add(d3);
List<Integer> a=d.stream().filter(t->t.proprice>10000).map(t->t.proprice).collect(Collectors.toList());
//	d1.product();
//	d2.product();
//	d3.product();
		System.out.println(a);
		

	}

}
