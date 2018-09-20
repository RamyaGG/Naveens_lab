 package javaInterviewQuestions;

import java.util.Scanner;
/*
The logical and operator ‘&&’ expects its operands to be boolean expressions (either 1 or 0) and returns a boolean value.
The bitwise and operator ‘&’ works on Integral (short, int, unsigned, char, bool, unsigned char, long) values and return Integral value.
*/
public class EvenOrOddUsingBitwiseAND {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int x=sc.nextInt();
		
		if((x & 1)==0) //if the last bit is 1, the result of x & 1 is 1; otherwise, it is 0. This is a bitwise AND operation.
			System.out.println("Even number");
		else
			System.out.println("Odd number");

	}


}
