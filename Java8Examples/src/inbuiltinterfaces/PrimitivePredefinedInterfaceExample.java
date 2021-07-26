package inbuiltinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class PrimitivePredefinedInterfaceExample {

	public static void main(String[] args) {
		//If we know our Predicate will only take primitive value then we can utilize specific
		//functional interface to avoid boxing-unboxing of primitive to object values.
		IntPredicate p1 = i1 -> i1 > 50;
		System.out.println(p1.test(40));
		
		IntConsumer c1 = i1 -> System.out.println(i1);
		c1.accept(20);
		
		
		//Unary & Binary operators
		//In places we have same input & output with same return type, we do not need to mention it twice.
		
		UnaryOperator<Integer> u1 = i1 -> i1*10;
		System.out.println(u1.apply(10));
		
		BinaryOperator<Integer> b1 = (i1,i2) -> i1*i2;
		System.out.println(b1.apply(10, 20));
		
		IntUnaryOperator u2 = (i1) -> i1*10;
		System.out.println(u2.applyAsInt(50));
		
		IntBinaryOperator b2 = (i1,i2) -> i1*i2;
		System.out.println(b2.applyAsInt(10, 60));

	}

}
