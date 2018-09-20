package javaInterviewQuestions;

import java.util.Scanner;

//In number theory, a perfect number is a positive integer that is equal to the sum of its proper positive divisors, 
//that is, the sum of its positive divisors excluding the number itself (also known as its aliquot sum).
//Eg : 6

public class PerfectNum {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int x=sc.nextInt();
		int counter=0;
		for(int i=1;i<=x/2;i++){
			if(x%i==0){
				counter=counter+i;
			}
		}
		if(x==counter){
			System.out.println("Perfect number");
		}
		else
			System.out.println("Not a perfect number");

	}


}
