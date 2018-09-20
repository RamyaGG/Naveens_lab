package javaInterviewQuestions;

public class FactorialUsingRecurrsion {

	public int fact(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * fact(n - 1);
		}
	}

	public static void main(String[] args) {
		FactorialUsingRecurrsion myObj = new FactorialUsingRecurrsion();
		int n = 6;
		System.out.println(myObj.fact(n));

	}

}
