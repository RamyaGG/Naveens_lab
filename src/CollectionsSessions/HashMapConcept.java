package CollectionsSessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		//HashMap is a class implements Map interface
		//extends Abstract Map
		//it contains only unique elements
		//stores the values  - key - value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//hashmap is not synchronized -- not thread safe. if it is used in MultiThreading Environment then more than one thread can access and process the hashMap simultaneously
		//it means there are multiple threads running on then hashMap objects can be acessed by all the threads
		//so the performance of the hashmap will be increased automatically
		//Whenever you have to use fast performance system in that case we have to use HashMap
		//We dont use HashTable bcoz it is synchronized. it is thread safe
		
		// fail fast condition : if any thread modifies the hashmap ( add or remove) thn we will get concurrentModification exception
		
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(4));
		
		for(Entry<Integer, String> m : hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 25, "admin");
		Employee e2 = new Employee("Peter", 26, "QA");
		Employee e3 = new Employee("Steve", 27, "Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//Treaverse the hashMap:
		for(Entry<Integer, Employee> m : emp.entrySet()){
		int key = m.getKey();
		Employee e = m.getValue();
		System.out.println("Employee "+key+" Info");
		System.out.println(e.name+" "+e.age+" "+e.dept);
		}


	}

}
