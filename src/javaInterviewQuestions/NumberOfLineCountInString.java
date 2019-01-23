package javaInterviewQuestions;

import java.util.Arrays;

public class NumberOfLineCountInString {

	public static void main(String[] args) {
		String s = "Hi Welecome to Selenium WebDriver\n" + 
				"Basics of programming\n" + 
				"Hi Welecome to Selenium WebDriver\n" + 
				"Basics of programming\n" + 
				"Hi Welecome to Selenium WebDriver\r" + 
				"Basics of programming";
		
	String arr[]=s.split("[\n|\r]");
	System.out.println("Number of line count is "+(arr.length));
	System.out.println(Arrays.toString(arr));

	}
	
	

}
