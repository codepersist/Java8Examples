package interfaces;

public interface Surgeon {

	default void operate() {
		System.out.println("Patient is being operated by a specialist");
	}
	
	public static void getMessage() {
		System.out.println("The surgeon is expert in his field");
	}
}
