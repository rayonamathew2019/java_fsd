package ustbatchno3.junit5testcases;

import java.util.List;

public class Textile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public static long text(List<String> dress, List<Integer> price) {
		// TODO Auto-generated method stub
		return dress.stream().count();
		
	}
	public static long text1(List<String> dress, List<Integer> price) {
		// TODO Auto-generated method stub
		return price.stream().mapToInt(Integer::intValue).sum();
	}

}
