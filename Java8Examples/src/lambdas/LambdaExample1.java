package lambdas;

@FunctionalInterface
interface Car {
	public void getCarName();
}

class Audi implements Car {

	@Override
	public void getCarName() {
		System.out.println("Audi");
	}
}

class Honda implements Car {

	@Override
	public void getCarName() {
		System.out.println("Honda");
	}
}

public class LambdaExample1 {

	public static void main(String[] args) {
		System.out.println("Without Lambda expressions");
		Car car1 = new Audi();
		car1.getCarName();

		/*In case of Lambda expressions, we can use the method as below.
		Also the above 2 classes Audi & Honda becomes redundant with lambdas*/
		System.out.println("With Lambda expressions");
		Car car2 = () -> System.out.println("Honda City");
		car2.getCarName();
	}
}

