package ustbatchno3.Testng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Vishwa {
	 private String nameOfCity;
	    private double priceWithMaterial;
	    private double priceWithoutMaterial;

	    public Vishwa(String nameOfCity, double priceWithMaterial, double priceWithoutMaterial) {
	        this.nameOfCity = nameOfCity;
	        this.priceWithMaterial = priceWithMaterial;
	        this.priceWithoutMaterial = priceWithoutMaterial;
	    }
	    public String getNameOfCity() {
	        return nameOfCity;
	    }
	    public double getPriceWithMaterial() {
	        return priceWithMaterial;
	    }

	    public double getPriceWithoutMaterial() {
	        return priceWithoutMaterial;
	    }
	    public List getThePriceOnSquareFeet(double squareFeet) {
	        double priceWithM = squareFeet * getPriceWithMaterial();
	        double priceWithoutM = squareFeet * getPriceWithoutMaterial();
	        return Arrays.asList(priceWithM, priceWithoutM);
		

	}

}
