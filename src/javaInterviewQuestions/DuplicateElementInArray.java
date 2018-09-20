   package javaInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class DuplicateElementInArray {

	public static void main(String[] args) {
		String names[] = {"Java", "C","Phython","Pearl","Java", "C"};
		String[] duplicates = new String[names.length];
		
		//method 1 using for loop Comaparision . time Complexity is O(n2) -- > worst Solution
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equalsIgnoreCase(names[j])) {
					System.out.println("Duplicate Element is "+names[i]);
					duplicates[i]=names[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(duplicates));

	System.out.println("****************************************************");
	
		//Method 2 using HashSet. In set we can only store unique values . O(n)
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate Element is "+name);
				
			}
		}
		
		System.out.println("****************************************************");
		
		//method 3 Using HashMap . O(2n)
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for(String name: names) {
			Integer count = storeMap.get(name);
			if(count==null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
				//System.out.println(name);
			}
			
		}
		
		
		
		//Get the Values from this HashMap
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate Element is "+entry.getKey());
			}
		}
			
	}

}
