package inbuiltinterfaces;

import java.util.function.Consumer;

//Consumer
//Predefined functional interface
//Consumes value without output
//To display some information
public class ConsumerExample {

	public static void main(String[] args) {
		
		//Consumer accept method
		Consumer<String> c1 = str -> System.out.println(str.length());
		c1.accept("Java 8");
		
		//Consumer Chaining
		Consumer<String> c2 = str -> System.out.println(str);
		c2.andThen(c1).accept("Java 8");

	}

}
