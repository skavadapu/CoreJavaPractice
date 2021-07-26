package javaBasics;

public abstract class ParentAirCraftAbstract {
	
	//Abstraction is the process in which implemention details are hidden partially.
	//Abstract method which has no implementation method (same as interface)
	//Interface is 100% abstraction where as Abstract Class is partial abstraction
	//Abstract class can have both implemented/concrete and unimplemented/not concrete methods
	//Abstract method and class will be added a keyword 'abstract'
	
	
	public void EngineRules() {
		System.out.println("All Aircrafts should follow the Aviation Guidelines");
	}
	
	public void safetyGuidelines() {
		System.out.println("All Aircrafts should follow the Aviation Safety Guidelines");
	}
	
	public abstract void aircraftColour();  //This is abstract method as there is no implmentation.  Child class (Emirates) to implement their own aircraft colour
	
	

}
