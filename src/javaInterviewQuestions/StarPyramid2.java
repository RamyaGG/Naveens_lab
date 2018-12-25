package javaInterviewQuestions;

public class StarPyramid2 {

	public static void main(String[] args) {
		//Pyramid
				int rows = 5;

		        for(int i = 1; i <= rows; i++) {
		            for(int space = 1; space <= rows - i; space++) {
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
		        for(int i = rows; i >= 1; i--) {
		            for(int space = rows - i; space >=1 ; space--) {
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
