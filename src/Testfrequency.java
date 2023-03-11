package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testfrequency {

	@Test
	public void namefre() {
		
		List<String> l1=Arrays.asList("ammu","appu","ammu","achu");
		List<String> target=Arrays.asList("ammu","appu","achu");
		List<Integer> expected=Arrays.asList(2,1,1);
		long actual=Frequency.countname(l1,target);
		assertEquals(expected,actual);

		
	}
	
	
	
}
