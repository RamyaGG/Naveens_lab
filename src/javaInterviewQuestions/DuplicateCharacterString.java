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
		System.out.println("Duplicate Char is :: ");
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.print(str.charAt(j)+" ");
				}
			}
		}
		
		
		//Method 2
		
		char charArray[] = str.toCharArray();
		String removeDup="";
		Set<Character> charSet = new HashSet<Character>();
		
		System.out.println("\nDuplicate characters ");
		for(Character temp : charArray ) {
			if(charSet.add(temp)==false) {
				System.out.print(" "+temp);
			}else
			{
				removeDup+=temp;  //To Remove Duplicate Characters from the string : indoesa
			}
			
		}

		System.out.println("\n"+removeDup);
		
		
		//Method 3
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character a: charArray) {
			Integer count = map.get(a);
			if(count==null) {
				map.put(a, 1);
			}else {
				map.put(a, ++count);
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
