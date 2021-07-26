package javaBasics;

public interface CentralTrafficInterfaceDemo {
	
	//In this interface we are creating methods but no implementations (i.e. no action in it).  Actions will be defined
	//in the calling Class i.e. AustralianTrafficInterfaceCallDemo
	
	//The below traffic signals needs to be followed by all the countries but how they are implementing depends on their own country
	//rules
	public void goGreen() ;
	public void waitAmber();
	public void stopRed();
	
	int a =10;  //Variable can be given in Interface and also by default their access modifer is PUBLIC
	
	

}
