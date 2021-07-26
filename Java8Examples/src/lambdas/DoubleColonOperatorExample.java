package lambdas;

//Double colon operator for method reference & constructor reference
//we want to reuse already existing implementation, we can use double colon operator

interface Bike {
	public String getName();
}

class Engine
{
	Engine() {
		System.out.println("Engine is created!! ");
	}
}

 interface NewBike
 {
	public Engine getEngine();
		
 }
class DoubleColonOperatorExample {
	
	public static String printName() {
		return "Example for static reference using double colon operator";
	}
	
	public  String displayName() {
		return "Example for non static reference using double colon operator";
	}

	public static void main(String[] args) {
		
		//Method Reference static method
		//classname::methodname
		Bike b1 = DoubleColonOperatorExample::printName;
		System.out.println(b1.getName());
		
		//Method Reference non-static method
		//objectreference::methodname
		DoubleColonOperatorExample dc = new DoubleColonOperatorExample();
		Bike b2 = dc::displayName;
		System.out.println(b2.getName());
		
		
		//Without Constructor Reference
		//classname::new
		NewBike b3 = () -> new Engine();
		b3.getEngine();
		
		//Constructor reference
		NewBike b4 = Engine:: new;
		b4.getEngine();
	}

}
