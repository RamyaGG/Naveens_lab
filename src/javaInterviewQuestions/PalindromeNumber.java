package javaInterviewQuestions;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 12321;
		int temp=num;
		int rev = 0;
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Number:: "+temp+" Rev:: "+ rev);
		if(rev==temp) {
			System.out.println("Given Number is palindrome");
		}else {
			System.out.println("Given Number is not palindrome");
		}

	}

}
