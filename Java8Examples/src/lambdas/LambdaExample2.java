package lambdas;

@FunctionalInterface
interface Calculator {
	public int perform(int a, int b);
}

class Add implements Calculator {


	@Override
	public int perform(int a, int b) {
		return a + b;
	}
}

class Multiply implements Calculator {

	@Override
	public int perform(int a, int b) {
		return a * b;
	}
}

public class LambdaExample2 {

	public static void main(String[] args) {
		System.out.println("Without Lambda expressions");
		Calculator calculator1 = new Add();
		System.out.println(calculator1.perform(10, 20));

		/*In case of Lambda expressions, we can use the method as below.
		Also the above 2 classes Add & Multiple becomes redundant with lambdas
		Also, we are using scenario at runtime for different calculation */
		System.out.println("With Lambda expressions");
		Calculator calculator2 = (a,b) -> a-b;
		System.out.println(calculator2.perform(20, 5));
	}
}

