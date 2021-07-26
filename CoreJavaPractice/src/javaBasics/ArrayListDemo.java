package javaBasics;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList grows dynamic in size so not fixed like Arrays.
		//ArrayList can have duplicate values
		//Can insert item in any index in ArrayList
		//Index based add and remove allowed in ArrayList
		//Elements are case sensitive
		//ArrayList, LinkedList, Vector implements List Interface
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("India");
		al.add("NewZealand");
		al.add("Spain");
		al.add("Turkey");
		
		al.remove(3);  //Remove turkey
		al.remove("Spain"); //Remove spain
		
		al.add(0, "USA");  //Adding element in India place
		al.add("India"); //Adding duplicate elements
		
		System.out.println(al.isEmpty());  //Returns boolean
		System.out.println(al.indexOf("NewZealand")); // identifying the index of element based on value 
		System.out.println(al);  //Prints all the available elements in the List
		

	}

}
