package ustbatchno3.junit5testcases;
//
//import java.util.List;
//import java.util.stream.Stream;
//
//public class Vehicle {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
////		
//		
//
//	}
//
//	public static String veh(String r) {
//		// TODO Auto-generated method stub
//		if(r.substring(0,2)=="KL") {
//			
//		}
////			return "Kerala";
//		return "Kerala";
//		
//		
		
//	}
//
//	public static String veh1(String r) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Vehicle {
//	Scanner sc = new Scanner(System.in);
//	int registrationNumber=sc.nextInt();
//
//   HashMap<String, String> states = new HashMap<String, String>();
//   HashMap<String, String> districts = new HashMap<String, String>();
//
//  public void VehicleRegistrationNumber() {
//    // Add state codes and names to the state lookup table
//    states.put("AP", "Andhra Pradesh");
//    states.put("AR" ,"Arunachal Pradesh");
//    states.put("AS", "Assam");
//    // Add more state codes and names here...
//
//    // Add district codes and names to the district lookup table
//    districts.put("01", "Adilabad");
//    districts.put("02", "Anantapur");
//    districts.put("03", "Chittoor");
//    // Add more district codes and names here...
// }
//
//  public String getStateFromRegistrationNumber(String registrationNumber) {
//    String stateCode = registrationNumber.substring(0, 2);
//    return states.get(stateCode);
//  }
//
//  public String getDistrictFromRegistrationNumber(String registrationNumber) {
//    String districtCode = registrationNumber.substring(2, 4);
//    return districts.get(districtCode);
//  }
//}






import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vehicle {
	
	public static List<String> sdataset(String f) {
		
//		Map<String,Map>=new HashMap<>();
//		Map<String,String> ma
//		map1.
		
//		List<String>ls=Arrays.asList("Kerala","Tamilnadu","Punjab");
//		String STE="KE";
//		List<String>S=ls.stream().map(t->t.toUpperCase()).filter(t->t.startsWith(STE)).collect(Collectors.toList());
//		System.out.println(S); 
		
		Map<String,String> map=new HashMap<>() ;
		map.put("KL","kERALA");
		map.put("TN","Tamilnadu");
		map.put("KA","Karnadaka");
	String	DE=f.substring(0,2);
//	System.out.println(DE);
	boolean T=map.containsKey(DE);
	String s1 = null;
	if(T==true) {
		s1=(map.get(DE));
		}
	if(DE.equals("KL"))	{
		Map<String,String> map1=new HashMap<>() ;
			map1.put("05","Kottayam");
			map1.put("07","Ekm");
			map1.put("01","Tvm");
		String	DE1=f.substring(2,4);
		boolean T1=map1.containsKey(DE1);
		String s3 = null;
		if(T1==true) {
			
			s3=(map1.get(DE1));
			}
	
		List<String> lm=Arrays.asList(s1,s3);
		return lm;
	}
	else if(DE.equals("TN"))	{
		Map<String,String> map2=new HashMap<>() ;
		map2.put("05","KALLAR");
		map2.put("07","OOTY");
		map2.put("01","TALAVOOR");
	String	DE1=f.substring(2,4);
	boolean T1=map2.containsKey(DE1);
	String s3 = null;
	if(T1==true) {
		s3=(map2.get(DE1));
		}

	List<String> lm=Arrays.asList(s1,s3);
	return lm;
}
	return null;
	
				
		
	}
	
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sdataset("KL07BM8989"));
		
		

	}

}