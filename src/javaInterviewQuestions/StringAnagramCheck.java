package javaInterviewQuestions;

import java.util.Arrays;

public class StringAnagramCheck {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		String anag="";

		char char1[] = str1.toCharArray();
		char char2[] = str2.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		boolean anagram = Arrays.equals(char1, char2);

		if (anagram) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an Anagram");
		}
		
		//Method 2 this will work only for distict element
		for(int i=0; i<str1.length();i++) {
			for(int j=0; j<str2.length(); j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					anag+=str1.charAt(i);
				}
			}
		}
		
		System.out.println("Anag  "+anag);
		if(anag.equals(str1)) {
			System.out.println("Given String are anagram");
		}else{
			System.out.println("Given String are not anagram");
		}

	}

}
