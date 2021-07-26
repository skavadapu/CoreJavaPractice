package javaBasics;

public class MultiDimArrays {

	public static void main(String[] args) {
	
		/*Single Dimensional Arrays declared as below
		 * int a[] = new int[3];/declare method 1
		 * a[0] = 2; a[1]=3; a[2]=5; // assigning values
		 * int a[] = {2,3,5}  //Declaring method 2 and assigning values in one go
		*/
		
		//Multi dimentional array is nothing but matrix data values mentioned in rows/x-axis and columns/Y-axis
		//int a[rows][columns] = new int[2][3] declaring multi dim arrays
		
	//	int a[][]= new int[2][3];
		//assigning values
	/*	a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
	*/	
		// or above can be declared as below
		
		int a[][] = {{2,4,5},{3,4,7}};		
		//Retrieving all these values through coding
		
		for (int i=0; i<2; i++) { //outer loop stands for rows
			
			for (int j=0; j<3; j++) { //inner loop stands for columns
				System.out.println(a[i][j]);
			}
			
		}
		
	
	}

}
