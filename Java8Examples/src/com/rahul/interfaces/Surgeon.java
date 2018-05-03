package com.rahul.interfaces;

public interface Surgeon {

	default void operate() {
		System.out.println("Patient is being operated by a specialist");
	}
}
