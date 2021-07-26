package javaBasics;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
			
			//HashSet, TreeSet & LinkedHashSet implements Set Interface
			// Set items doesn't allow duplicate values
			// Add/remove/search based on index doesn't allow as it indexing items automatically
		    // No guarantee that elements are stored in sequential order ( order may be in random)
		// No looping mechanism required to display all the elements
		//Iterator used to display the elements from all Collections
		
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Ram");
		hs.add("Lalit");
		hs.add("Sailu");
		
		System.out.println(hs.size());
		System.out.println(hs);
		
		hs.add("Gopi");
		hs.add("Gokul");
		
		hs.remove("Gopi");
		
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		
		

	}

}
