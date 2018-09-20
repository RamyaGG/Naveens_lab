package CollectionsSessions;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.hash.HashFunction;

public class HashTableConcept {

	public static void main(String[] args) {
		//HashTable : it is similar to hashMap but it is synchronized
		//store the value on the basis of Key value
		//Key --> Object-- HashCode--> Value
		//Key is stored in the form of object. Each and Every Object is having one HashCode and in hashCode we will store value

		//HashCode -- 32 bit sign integer number
		
		//if you want increase the performance then go for hashmap not hashtable
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Java");
		
		//Create a clone copy/shallow copy
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2 = (Hashtable)h1.clone();
		
		System.out.println("The values from h1 "+ h1);
		System.out.println("The values from h2 "+ h2);
		
		h1.clear();
		
		System.out.println("The values from h1 "+ h1);
		System.out.println("The values from h2 "+ h2);
		
		//contains value:
		Hashtable<String, String> st = new Hashtable<String, String>();
		st.put("A", "Naveen");
		st.put("B", "Manager");
		st.put("C", "Selenium");
		
		if(st.containsValue("Naveen")) {
			System.out.println("Value is available");
		}
		
		//print all the values form hashtable using -- Enumeration -- elements()
		
		Enumeration<String> e = st.elements();
		System.out.println("print values from st using Enumerations");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		//get al the values from Hashtable using -- entrySet() -- set of hashtable values
		
		Set<Entry<String, String>> entrySet = st.entrySet();
		System.out.println("print values from st using EntrySet");
		System.out.println(entrySet);
		
		//HashTable contains only unique elements. Both key and value
		
		Hashtable<String, String> st1 = new Hashtable<String, String>();
		st1.put("A", "Naveen");
		st1.put("B", "Manager");
		st1.put("C", "Selenium");
		st1.put("C", "Selenium"); // it contains only unique values
		
		//no null key and null values
//		st1.put(null, "Selenium"); //java.lang.NullPointerException
//		st1.put("D", null); //java.lang.NullPointerException
		
		
		System.out.println("Values from st1");
		System.out.println(st1);
		
		//Check both the hastable are equal or not:
		
		if(st.equals(st1)) {
			System.out.println("Both are equal");
		}
		
		//get the value from a key
		System.out.println(st1.get("A"));
		
		//get the hashcode of hashtable object
		System.out.println("the HashCode value of st1: "+st1.hashCode());
		
		
		
		
		
	}

}
