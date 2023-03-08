package cities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filtert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("Tamilnadu","Pala","Changanacherry","Trivandrum");
		List<String> m=s.stream().filter(t->t.startsWith("T")).collect(Collectors.toList());
				System.out.println(m);
	}

}
