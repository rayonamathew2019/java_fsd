package ustbatchno3.junit5testcases;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//import org.junit.Test;
//
//public class Testvehicle {
//
//	
//	@Test
//	public void vehi() {
//	String r = "KL074B8";
//	String expected1="Kerala";
//	String expected2="Kottayam";
//	String actual1=Vehicle.veh(r);
//	String actual2=Vehicle.veh1(r);
//	assertEquals(expected1,actual1);
//	
//	}
//	
////}
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//
//public class Testvehicle {
//
//  @Test
//  
//  public void testGetStateFromRegistrationNumber() {
//   Vehicle vr = new Vehicle();
//    String state = vr.getStateFromRegistrationNumber("KA01AB1234");
//    assertEquals("Karnataka", state);
//  }
//
//  @Test
//  public void testGetDistrictFromRegistrationNumber() {
//    Vehicle vr1 = new Vehicle();
//    String district = vr1.getDistrictFromRegistrationNumber("KA01AB1234");
//    assertEquals("Bangalore Urban", district);
//  }
//}



import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Testvehicle {
	@Test
	 public void test() {
		List expected=Arrays.asList("Tamilnadu","KALLAR");
		String no="TN05BM6767";
		List actual1=Vehicle.sdataset(no);
		System.out.println(actual1);
		 assertEquals(expected,actual1);
		
	}
}