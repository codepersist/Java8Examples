package interfaces;

public class InheritanceExample implements Doctor, Surgeon{

	public static void main(String [] args)
	{
		InheritanceExample in = new InheritanceExample();
		in.operate();
	}

	@Override
	public void operate()
	{
		System.out.println("Patient is being operated");  // Overriding the operate() method in Class - Implementation 1
		
		Doctor.super.operate();  // Calling the specific interface with super keyword - Implementation 2
	}
}
