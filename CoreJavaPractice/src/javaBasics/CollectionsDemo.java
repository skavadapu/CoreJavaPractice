package javaBasics;

import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		// Amazon Interview Question
		// Print the unique number and how many occurrances of there for all numbers
		//  {4,5,5,5,6,2,7,9,7,2,6}
		
		int a[] = {4,5,5,5,6,2,7,9,7,2,6};
		
		
		//Create one ArrayList and dump all unique values into them and count number of occurrances
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i=0; i<a.length; i++) {
			
				int k=0; //counter for number of occurrances

			if(!al.contains(a[i])) {  //Checking if number already present in Array list
				
				al.add(a[i]); //adding the unique numbers to ArrayList
				k++; //increment the occurrance
			
				
				for (int j=i+1; j<a.length; j++) {
					
					if (a[i]==a[j]) {
						
						k++;
					}
					
				}
				
				if (k==1) {
				System.out.println("Unique number in the array is "+a[i]);
				}
			
			}

			
		}
	
	
	
	}
}
