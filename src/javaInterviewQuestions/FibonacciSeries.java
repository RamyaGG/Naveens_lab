package javaInterviewQuestions;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1=0, n2=1, n3=1 , num =5;
		System.out.print(n1+" "+n2);
	for(int i=2; i<=num ; i++) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		
			
		}

	}

}