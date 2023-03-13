package ustbatchno3.Testng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Testvishwa {
	@Test
	
	
	public void vis() {

//		List<Vishwa> List = new ArrayList<Vishwa>();
//		Vishwa c1 = new Vishwa("TVM",1600,800);
//		Vishwa c2 = new Vishwa("Chennai",1800,1000);
//		Vishwa c3 = new Vishwa("Mumbai",2500,1200);
//		Vishwa c4 = new Vishwa("Cochin",1800,1200);
//		Vishwa c5 = new Vishwa("Hyderabad",2000,900);
//		List.add(c1);
//		List.add(c2);
//		List.add(c3);
//		List.add(c4);
//		List.add(c5);
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the city : ");
//		String s = sc.next();
//		System.out.println("Enter the square feet : ");
//		int i = sc.nextInt();
//		List<Vishwa> l= List.stream().count();

        List<Vishwa> theSalesData = new ArrayList<>();

        theSalesData.add(new Vishwa("TVM", 1600, 800));
        theSalesData.add(new Vishwa("Chennai", 1800, 1000));
        theSalesData.add(new Vishwa("Hyderabad", 2000, 900));
        theSalesData.add(new Vishwa("Mumbai", 2500, 1200));
        theSalesData.add(new Vishwa("Cochin", 1800, 1200));


        String userGivenCity = "TVM";
        double userGivenSquareFeet = 2;

        List myPriceList = theSalesData.stream()
                .filter(val -> val.getNameOfCity().equalsIgnoreCase(userGivenCity))
                .map(val -> val.getThePriceOnSquareFeet(userGivenSquareFeet)).collect(Collectors.toList()).get(0);

        double totalAmount = theSalesData.stream()
                .filter(val -> val.getNameOfCity().equalsIgnoreCase(userGivenCity))
                .map(val -> val.getThePriceOnSquareFeet(userGivenSquareFeet))
                .collect(Collectors.toList()).get(0).stream().mapToDouble(f -> (double) f).sum();

        System.out.println("Location: " + userGivenCity);
        System.out.println("Square Feet: " + userGivenSquareFeet);
        System.out.println("Price with material : " + myPriceList.get(0));
        System.out.println("Price without material : " + myPriceList.get(1));
        System.out.println("Total amount: " + totalAmount);

        String myCity = "TVM";
        double squareFeet = 2;
        List<Double> priceList = Arrays.asList(3200.0, 1600.0);
        double totalExpected = 4800.0;

        Assert.assertEquals(myPriceList, priceList);
        Assert.assertEquals(totalAmount, totalExpected);

	}

}
