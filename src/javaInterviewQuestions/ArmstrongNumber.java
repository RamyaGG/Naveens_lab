package javaInterviewQuestions;

import java.util.Scanner;
/*An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 
 * For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.*/

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check");
		int i=sc.nextInt();
		
		int temp=i;
		int sum=0;
		int r;
		
		while(temp!=0){ 
			
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		
		if(i==sum){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not an armstrong number");
		}
		


	}

}
