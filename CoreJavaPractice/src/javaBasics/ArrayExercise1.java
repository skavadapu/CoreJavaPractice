package javaBasics;

public class ArrayExercise1 {

	public static void main(String[] args) {
		// Find the minimum number from the below two dimensiona array
		
		int abc[][]= {{2,4,3},{3,4,17},{5,2,9}};
		
		//Q1: Finding the minimum number from the array
		//Q2: Find the minimum number column and find the maximum number in that column
		int minNum = abc[0][0];
		int colNum=0;
		
		for (int i=0; i<3;i++) {
			
			for (int j=0; j<3; j++) {
				
				if (abc[i][j]<minNum) {
					minNum = abc[i][j];
					colNum=j;  //Grabbing the column number
				}
				
			}
			
		}
		System.out.println("Minimum Number out of Matrix is "+minNum);
		int maxNum = abc[0][colNum];
		int k=0;
		
		while(k<3) {
			if (abc[k][colNum]>maxNum) {
				maxNum=abc[k][colNum];
			}
			k++;
		}
		System.out.println("Maxmum Number in Minmum value column is " +maxNum);
		
	

	}

}
