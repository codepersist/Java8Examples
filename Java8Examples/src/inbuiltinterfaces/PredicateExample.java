package inbuiltinterfaces;

import java.util.function.Predicate;

//Predicate
//for conditional check
//boolean valued function
public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> p1 = num -> num > 20;
		System.out.println(p1.test(30));

		Predicate<String> p2 = str -> str.length() > 5;
		System.out.println(p2.test("Labmda"));
		System.out.println(p2.test("Session"));
		System.out.println(p2.test("test"));

		//Predicate Chaining
		Predicate<Integer> p3 = num -> num > 100;
		System.out.println(p1.and(p3).test(105));

		Predicate<Integer> p4 = num -> num.equals(20);
		System.out.println(p4.test(10));
	}
}
