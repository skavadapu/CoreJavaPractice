package javaBasics;

public class ThisDemo {

	int a = 99; //Variable which is global and accessible throughout the class
	//'this' keyword will be used to access the class level variable in methods
	
	public void getData() {
		int a = 44;  //Local variable which scope is method level
		
		System.out.println("Method level variable value = "+ a);
		System.out.println("Global variable value = "+ this.a);
		
	}
	
	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		
		td.getData();
	}

}
