package inbuiltinterfaces;

import java.util.function.Supplier;

//Supplier
//Predefined functional interface
//Returns something without taking input
public class SupplierExample {

	public static void main(String[] args) {
		
		//Supplier
		Supplier<Double> s1 = () -> Math.random();
		System.out.println(s1.get());
	}

}
