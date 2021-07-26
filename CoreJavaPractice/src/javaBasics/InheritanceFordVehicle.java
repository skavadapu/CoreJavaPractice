package javaBasics;

public class InheritanceFordVehicle extends InheritanceParentVehicle{
	
	public void engine() {
		System.out.println("Ford created new robust Engine");
	}
	
	public void AudioSystem() {  //Trying to do Method Overriding.  AudioSystem is there in both parent and child with
		//same name. arguments, signature, data types
		//Priority will be given to local (child) and then parent here.
		System.out.println("Audio System code from Child class - Method Overriding");
	}

	public void colour() {
		System.out.println("Ford colour is "+colour);
	}
	
	public static void main(String[] args) {
		
		
		InheritanceFordVehicle childFord = new InheritanceFordVehicle();
		
		//3 methods inherited from parent class
		childFord.Gears();
		childFord.Breaks();
		childFord.AudioSystem();  //Child method will be called as per priority - called Method/Functional Overriding
		// 1 new method created here as it is new requirement for Ford
		childFord.engine();
		childFord.colour();

	}

}
