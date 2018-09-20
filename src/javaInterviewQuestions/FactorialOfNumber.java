package javaInterviewQuestions;

import java.util.*;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		int fact = 1;
		
		for (int i=a ; i>=1; i--) {
			fact = fact*i;
			
		}
		
		System.out.println("Factorial of number is "+ fact);

	}

}
