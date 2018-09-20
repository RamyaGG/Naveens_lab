  package javaInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Write a program to find duplicate character in a string.

public class DuplicateCharacterString {

	public static void main(String[] args) {
		String str = "indonesiai";
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println("Duplicate Char is :: "+ str.charAt(j));
					System.out.println();
				}
			}
		}
		
		//Method 2
		
		char c[] = str.toCharArray();
		
		Set<Character> charSet = new HashSet<Character>();
		for(Character temp : c ) {
			if(charSet.add(temp)==false) {
				System.out.println("Duplicate characters "+ temp);
			}
			
		}

		//Method 3
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character a: c) {
			Integer count = map.get(a);
			if(count==null) {
				map.put(a, 1);
			}else {
				map.put(a, ++count);
				//System.out.println("Duplicate Character is "+ a+" Occurence is "+ count);
			}
		}
		
		Set<Entry<Character, Integer>> setEntry = map.entrySet();
		for(Entry<Character, Integer> entry : setEntry) {
			if(entry.getValue()>1) {
			 System.out.println("Duplicate Character is "+ entry.getKey()+" Occurence is "+ entry.getValue());
			}
		}

	}

}
