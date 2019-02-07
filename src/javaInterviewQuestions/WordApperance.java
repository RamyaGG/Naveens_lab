package javaInterviewQuestions;

import java.util.Arrays;

//Write a program to check number of times substring appeared in a string

public class WordApperance {

	public static void main(String[] args) {
		String s = "raghu ne raghu raghu raghu se kaha ki raghu nahi aayega";

		String arr[] = s.split("raghu"); //[, ne ,  ,  ,  se kaha ki ,  nahi aayega] replace raghu with , for understanding
		
		System.out.println((arr.length) - 1);
		System.out.println(Arrays.toString(arr));

	}

}
