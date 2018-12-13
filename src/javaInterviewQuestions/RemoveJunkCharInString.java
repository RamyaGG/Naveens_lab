package javaInterviewQuestions;

public class RemoveJunkCharInString {

	public static void main(String[] args) {
		String str = "!@#$% Ramya %^&*(123 GG @$%&*&(";
		
		//Regular Expression : [^a-zA-Z0-9 ] --> It will exlude a-z A-Z 0-9 and space
		str= str.replaceAll("[^a-zA-Z0-9 ]", ""); //if you remove ^ o/p:!@#$%%^&*(@$%&*&(
		
		System.out.println(str);

		String s="!@#$% Ramya %^&*(123 GG @$%&*&(";
		s=s.replaceAll("\\w", ""); //for printing only special characters 
		System.out.println(s);
		
		String s1="My        name    is   Ramya  ";
		System.out.println(s1);
		s1=s1.replaceAll("\\s+", " "); // to trim the extra spaces between the words
		System.out.println(s1);
	}

}
