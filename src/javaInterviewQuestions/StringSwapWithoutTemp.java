 package javaInterviewQuestions;

public class StringSwapWithoutTemp {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		//Method 1
		  a = a.concat(b);
		  b = a.replace(b, "");
		  a = a.replace(b, "");
		  
		  System.out.println(a);
		  System.out.println(b);
		  
		  System.out.println("***************************************");
		  
		  //method 2
		  
		  a=a+b;
		  b=a.substring(0, a.length()-b.length());
		  a=a.substring(b.length());
		  
		  System.out.println(a);
		  System.out.println(b);
		  
	}

}
