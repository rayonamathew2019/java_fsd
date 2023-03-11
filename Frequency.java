package ustbatchno3.junit5testcases;

import java.util.List;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static long countname(List<String> l1, List<String> target) {
		// TODO Auto-generated method stub
		return l1.stream().count();
	}

}
