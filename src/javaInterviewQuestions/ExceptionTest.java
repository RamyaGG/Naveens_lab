package javaInterviewQuestions;

public class ExceptionTest {

	public static void main(String[] args) {
	
		int a=20;
		int b =0;
		String s= "Ramya";
		
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Arith");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Ex");
		}

	}

}
