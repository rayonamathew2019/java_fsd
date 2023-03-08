package countfrequenct;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Namefrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i,count=0,j;
		List<String> names=Arrays.asList("Ammu","Bchu","Ammu","Appu","Ammu","Achu");
		List<String> m=names.stream().filter(t->Collections.frequency(names,t)>1).collect(Collectors.toList());
		long total=names.stream().count();
		System.out.println(total);
//		for(i=0;i<6;i++) {
//			String a=m.get(i);
//			for(j=0;j<a.length();j++) {
//				if()
//			}
//		}
		

	}

}
