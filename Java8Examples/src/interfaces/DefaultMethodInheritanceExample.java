package interfaces;

public class DefaultMethodInheritanceExample implements Doctor, Surgeon{

	public static void main(String [] args)
	{
		DefaultMethodInheritanceExample in = new DefaultMethodInheritanceExample();
		in.operate();
	}

	/* Thing to note here: Since Surgeon interface is using static method, the class is not throwing error for overriding
	 * static method. 
	 * We do not need to override static method of interface in implemented class.
	 */
	@Override
	public void operate()
	{
		System.out.println("Patient is being operated");  // Overriding the operate() method in Class - Implementation 1
		
		Doctor.super.operate();  // Calling the specific interface with super keyword - Implementation 2
	}
}
