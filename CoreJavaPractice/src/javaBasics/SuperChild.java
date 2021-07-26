package javaBasics;

public class SuperChild extends SuperParent{  //SuperChild class inherits SuperParent class
	
	int dualVar = 10;  //SuperChild and SuperParent classes has same variable name called dualVar but values different
	
	public void getVariables() {
		
		System.out.println("Variable value from child class = " + dualVar);  //By default variable returns SuperChild i.e. local class variables
		//In order to get the variable from SuperParent then you need to use the keyword 'Super'
		System.out.println("Variable value from parent class = " + super.dualVar);
		
	}
	
	public SuperChild() {//constructor  - By default local constructor will be executed if given otherwise Parent Class
		super(); //this should be first line in child constructor
		System.out.println("Super Child class constructor");
	}
	
	public void getDataMethod() {
		super.getDataMethod(); //When Method name is same in both Parent and child class and child inherits parent class.
		//super keyword used for calling the parent Method.
		System.out.println("getDataMethod from Super Child class");
	}

	public static void main(String[] args) {
		
		SuperChild sc = new SuperChild();
		sc.getVariables();
		sc.getDataMethod();
		//Constructors doesn't need to be called in Main as they are first method invokes when class runs.
		//If child constructor not present then parent constructor will be run if provided otherwise child constructor invoked by default
		
		

	}

}
