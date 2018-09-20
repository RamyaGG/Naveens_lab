package javaInterviewQuestions;

/*
*
**
***
****
*****
 */
public class StarPattern {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"+ "");
			}
			System.out.println();
		}

	}

}

/*
*
***
*****
*******
*********
Java:
package JavaProgs;

import java.util.Scanner;

publicclass Pattern2 {

	publicstaticvoid main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a range");
		intx=sc.nextInt();
		
		intp=0;
		for(inti=1;i<=x;i++){
			for(intj=1;j<=i+p;j++){
				System.out.print("*");	
			}
			System.out.println();
			p=p+1;
		}
		

	}

}
*/
