package javaInterviewQuestions;

public class RemoveJunkCharInString {

	public static void main(String[] args) {
		String str = "!@#$% Ramya %^&*(123 GG @$%&*&(";
		
		//Regular Expression : [^a-zA-Z0-9 ] --> It will exlude a-z A-Z 0-9 and space
		str= str.replaceAll("[^a-zA-Z0-9 ]", "");
		
		System.out.println(str);

	}

}
