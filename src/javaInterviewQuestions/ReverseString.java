package javaInterviewQuestions;

public class ReverseString {
	
	//Reverse a String 
	//Difference b/w String & StringBuffer
	//reverse() is not avaliable in String. Its there in String Buffer

	public static void main(String[] args) {
		String str = "Ramya GG";
	    String rev = "";
		//str.length () = 8
	    
	    //Method 1
	    for(int i=str.length()-1; i>=0; i--) {
	    	rev = rev+str.charAt(i);
	    }
	    
	    System.out.println("Reverse of a String is ::"+rev);

	    //Method 2
	    StringBuffer sf = new StringBuffer(str);
	    System.out.println("Reverse of a String is ::"+sf.reverse());
	}

}
