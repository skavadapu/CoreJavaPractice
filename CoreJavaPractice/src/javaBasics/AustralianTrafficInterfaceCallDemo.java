package javaBasics;

public class AustralianTrafficInterfaceCallDemo implements CentralTrafficInterfaceDemo, ContinentTrafficInterface2{

	//Calling the CentralTrafficInterfaceDemo which has traffic methods and implementation given here
	//Interface called using implements keyword and while creating the object
	// Multiple interfaces can be accessed using any implementing class
	//Interfaces are defined without body i.e. no code for implementation
	public static void main(String[] args) {
	
		AustralianTrafficInterfaceCallDemo	AusTraffic = new AustralianTrafficInterfaceCallDemo();
		
		//3 methods from Centra interface 
		AusTraffic.goGreen();
		AusTraffic.waitAmber();
		AusTraffic.stopRed();
		//1 method from the class itselff
		AusTraffic.followRules();
		//one variable call from Central Interface
		System.out.println("Varible from Central Interface = "+AusTraffic.a);
		AusTraffic.stopAtTrainCrossSymbol();
	}

	@Override
	public void goGreen() {
		System.out.println("goGreen Traffic Implemented in Australia");
		
	}

	@Override
	public void waitAmber() {
		System.out.println("waitAmber Traffic Implemented in Australia");
		
	}

	@Override
	public void stopRed() {
		System.out.println("stopRed Traffic Implemented in Australia");
		
	}
	
	public void followRules() {
		System.out.println("Drivers - Please follow Traffic Rules");
	}

	@Override
	public void stopAtTrainCrossSymbol() {
		System.out.println("StopAtTranCrossSymbol is from Interace 2");
		
	}

}
