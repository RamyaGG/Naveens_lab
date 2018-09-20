package javaInterviewQuestions;

import java.util.Arrays;

public class NumberOfVowelsInString {

	public static void main(String[] args) {
		String str = "Ramya GG";
		str= str.toLowerCase();
		int count=0;
		
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		
		System.out.println("Number of Vowels is :: "+count);
		
	 

	/*	Write a program to make the string “Name is Smith” as “Smith is Name”.
				
				String s="Name is Smith";
				
				String temp;
				
				String [] arr=s.split(" ");
				
				temp=arr[0];
				arr[0]=arr[2];
				arr[2]=temp;
				
				for(String s1 : arr){
					System.out.print(s1+" ");
				}

		*/

		
		
	}

}
