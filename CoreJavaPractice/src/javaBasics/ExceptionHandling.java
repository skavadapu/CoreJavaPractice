package javaBasics;

import java.util.Arrays;

public class ExceptionHandling {

	/*Exceptions are handled comfortably using try and catch blocks
	 * If you don't handle exceptions then test will get error and fails.
	 * If you handle exception properly then customised user friendly error displayed and continues the execution
	 * Finally block code excutes irrespetive of pass or fail of test case
	 * Catch block will by try (no other statement occurs in between try and catch
	 * Try and Finally blocks also can paired without catch blocks
	 * Finally block used for executing clearing the cookies and closing the browser
	 * General exception class is Exception
	 * Exception class will be mentioned in last catch block as it is parent
	 * If there are multiple executable statements in Try block then it executes only first executable statment
	 * and jump to catch or finally blocks.
	 */
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			
		//	int res = a/b;  //infinity - Arithmatic exception occurs
			
			Arrays[] arr = new Arrays[5];
			
			System.out.println(arr[6]);
		}

		catch(ArithmeticException ae) {
			
			System.out.println("Arithmatic exception occurred!");
			
		}
		catch(IndexOutOfBoundsException aoe) {
			
			System.out.println("Index out of bound exception occurred!");
			
		}
		catch (Exception e) {
			System.out.println("General exception occurred!");
		}
		finally {
			System.out.println("Finally executes for delete cookies and/or close browsers");
		}
		
		
	}

}
