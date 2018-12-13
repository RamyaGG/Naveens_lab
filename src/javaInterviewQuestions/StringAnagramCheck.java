package javaInterviewQuestions;

import java.util.Arrays;

public class StringAnagramCheck {

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";

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

	}

}
