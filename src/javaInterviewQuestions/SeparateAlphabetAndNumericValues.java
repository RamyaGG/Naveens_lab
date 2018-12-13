package javaInterviewQuestions;

/* Write a prg to Separate Alphabets And NumericValues
 * Input -- Interview01 Java234 Program567
 * Output1 -- Interview Java Program
 * Output2 -- 01234567
 * */

//We can also use removeAll method with regular exp

public class SeparateAlphabetAndNumericValues {

	public static void main(String[] args) {
		String inputString = "Interview01 Java234 Program567";
	
		String alphabets = "";
		String numeric = "";
		
		for (int i=0; i<inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if(Character.isDigit(ch)) {
				numeric=numeric+ch;
			}
			
			else {
				alphabets=alphabets+ch;
			}
		}
		System.out.println("Alphabets values are : "+alphabets);	
		System.out.println("Numeric values are : "+numeric);

	}

}
