package javaInterviewQuestions;

public class StarPyramid2 {

	public static void main(String[] args) {
		//Pyramid
				int n = 5;

		        for(int i = 1; i <= n; i++) {
		        	
		            for(int j = 1; j <= n - i; j++) {
		                System.out.print("  ");
		            }

		            for(int k=0; k != 2 * i - 1; k++) {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }
		        
	  //Inverted One	        
		        
		        System.out.println();
		        //Inverted Pyramid
		        for(int i = n; i >= 1; i--) {
		        	
		            for(int j = n - i; j >=1 ; j--) {
		                System.out.print("  ");
		            }
		            	//2*i-1 =9
		            for(int k=0; k != 2 * i - 1; k++) {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }
	}

}
