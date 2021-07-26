package javaBasics;

public class childEmiratesAbstractCall extends ParentAirCraftAbstract{

	public static void main(String[] args) {
	
	//Object cannot be created for Abstract classes but allowed for interface classes
	//Access modifers in Abstract class i.e. Inheritance must be either Public, Protected or Default but not Private as these can be accessed by any child
		
		childEmiratesAbstractCall emirates = new childEmiratesAbstractCall();
		
		emirates.EngineRules();
		emirates.safetyGuidelines();
		emirates.aircraftColour();
		
	}

	@Override
	public void aircraftColour() {
		System.out.println("Emirates child used fabulous red and white logo and body colour");
		
	}

}
