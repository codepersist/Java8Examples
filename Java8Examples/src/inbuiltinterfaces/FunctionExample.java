package inbuiltinterfaces;

import java.util.function.Function;

//Function
//Predefined functional interface
//Accepts one argument & return any type of value
public class FunctionExample {

	public static void main(String[] args) {

		Function<String, Integer> f1 = str -> str.length();
		System.out.println(f1.apply("Expression"));
		System.out.println(f1.apply("Inbuilt function"));
		System.out.println(f1.apply("This length is calcuated including spaces"));

		//Function Chaining
		Function<String,String> f2 = str -> str.trim();
		System.out.println(f2.andThen(f1).apply(" This length is calcuated including spaces ")); //first & last spaces are not added in length
	}

}
