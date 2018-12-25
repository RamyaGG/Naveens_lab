package javaInterviewQuestions;

															/*
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 

 															*/

public class StarPyramid {

	public static void main(String[] args) {
		int n=6;
		for (int i=1; i<=n; i++) 
        {  
            for (int j=1; j<=n-i; j++) 
            { 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=1; j<=i; j++ ) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 

	}

}
