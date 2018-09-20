package javaInterviewQuestions;

public class SwapIntegerWithoutTemp {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		//Method 1
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("***********************");
		
		//Method 2
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("***********************");
		
		//Method 3 Using XOR
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		

	}

}
