package javaInterviewQuestions;

public class DetermineLeapYearExample {
	 
	public static void main(String[] args) {
		
		//year we want to check
		int year = 1000;
		
		//if year is divisible by 4, it is a leap year
		
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
	}
}