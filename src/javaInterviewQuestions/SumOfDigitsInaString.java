package javaInterviewQuestions;

//INT: WAP to find digits in a string and sum of the numbers
public class SumOfDigitsInaString {

	public static void main(String[] args) {
		String a = "m22n3j5";
		int sum =0;
		
		System.out.print("Numbers in a String are ");
		for(int i=0; i<a.length(); i++) {
			if(Character.isDigit(a.charAt(i))) {
				System.out.print(a.charAt(i)+" ");
				sum = sum + Integer.parseInt(a.charAt(i)+""); // parseInt will accept only strings
			}
		}
		System.out.println("\nSum of Digita in a String is "+ sum);
	}

}
