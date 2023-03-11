package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testsum {
	
	
	@Test
	public void sumofnum() {
		
		
		
		int target[]= {4,5};
		int expected =9;
		int actual =Sum.sumnum(target);
		assertEquals(expected,actual);
		
		
	}
	
}
