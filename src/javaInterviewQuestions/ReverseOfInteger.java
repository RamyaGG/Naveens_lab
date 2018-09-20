 package javaInterviewQuestions;

public class ReverseOfInteger {

	public static void main(String[] args) {
		long num = 12345;
		long rev = 0;
		
		// Method 1 Using for loop
		while (num!=0) { 
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse of Integer is ::"+rev);

		// Method 2 Using StringBuffer
		long num1 = 123456;
		System.out.println("Reverse of Integer is ::"+ new StringBuffer(String.valueOf(num1)).reverse());
	}

}
