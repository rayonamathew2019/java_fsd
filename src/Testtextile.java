package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testtextile {
	@Test
	public void tex() {
		LocalDate date = LocalDate.of(2017, Month.MAY, 24);
		
		List<String> dress=Arrays.asList("shirt","mund");
		List<Integer> price=Arrays.asList(400,800);
		
		long expected1=2;
		long expected2=1200;
		long actual1=Textile.text(dress,price);
		long actual2=Textile.text1(dress,price);
		assertEquals(expected1,actual1);
		assertEquals(expected2,actual2);
		
		
		
		
		
		
	}

}
