package javaBasics;

public class InheritanceParentVehicle {
	
	// In Inheritance, all methods are implemented means have code written/implemented in that parent
	//Child classes can inherit all the methods directly without changing the code and add additional methods if needed 
	//Child Classes can use extends keyword for inheriting the parent properties and methods
	//Multiple Inheritance is NOT allowed in Java but allowed in C++
	
	String colour = "Red";
	public void Gears() {
		System.out.println("Gears code written in Parent, just use it");
	}

	public void Breaks() {
		System.out.println("Breaks code written in Parent, just use it");
	}
	
	public void AudioSystem() {
		System.out.println("AudioSystem code written in Parent, just use it");
	}
}
