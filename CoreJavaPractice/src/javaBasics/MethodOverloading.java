package javaBasics;

public class MethodOverloading {
	
	//Method or Function overloading means the class has multiple methods/functions which has same name
	//Rules are methods can have same name but Arguments count should be differ or Arguments datatype should be differ
	//in Real time, this will be used while customer doing payments with different types of cards and amount
	
	public void getPaymentCard(int a) {
		System.out.println(a);
	}
	
	public void getPaymentCard(String a) {
		System.out.println(a);
	}
	
	public void getPaymentCard(String a, int b) {
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
	MethodOverloading	MO = new MethodOverloading();
	
		MO.getPaymentCard(100);
		MO.getPaymentCard("DebitCard");
		MO.getPaymentCard("Credit Card ", 200);
	}

}
