package inbuiltinterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredefinedInterfaceExample {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> p1 = (i1,i2) -> i1 > i2;	
		System.out.println(p1.test(20 , 10));
		
		BiFunction<String, String, String>  f1 = (s1,s2) -> s1.concat(s2);
		System.out.println(f1.apply("Strings", "Contactinated"));
		
		BiConsumer<String, String> c1 = (s1, s2) -> System.out.println(s1 + s2);
		c1.accept("Strings", "Combined");
		
		//Note: There is no BiSupplier as Supplier does not take any arguments.

	}

}
