package javaBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// HashMap has store the data in pairs i.e. key and value; Key can be either integer, string or anything
		// For displaying the contents pairs in HashMap needs to be used Set , Iterator and MapEntry classes
		//Keys are unique but Values can be duplicated
		//Pairs are stored randomly but not sequentially
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(4, "Jupiter");
		hm.put(3, "Mars");
		hm.put(10, "Earth");
		hm.put(33, "Jupiter");		//Object keys are unique but not Values
		System.out.println(hm); //this displays in pairs but individually
		
		//In order to display pairs indivudally as Key and Value then first cast the Hasmap to Set interface
		// and then use the Iterator and MapEntry class for displaying individually
		
		Set sh = hm.entrySet();  
		
		Iterator it = sh.iterator();
		//hashtable - pass table set collections
		
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		
	}

}
