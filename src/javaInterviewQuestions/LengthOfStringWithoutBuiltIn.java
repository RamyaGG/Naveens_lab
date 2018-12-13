 package javaInterviewQuestions;

public class LengthOfStringWithoutBuiltIn {

	public static void main(String[] args) {
		String str = "Ramya GG";
		str=str+'\0';
		int count=0;
		
		for(int i=0; str.charAt(i)!= '\0'; i++) {
			count ++;
			
		}
		
		System.out.println("Length of a string is "+count);

	}

}
