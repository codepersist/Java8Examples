package interfaces;

public interface Doctor {

	default void operate() {
		System.out.println("Patient is being operated by a general doctor");
	}
}
