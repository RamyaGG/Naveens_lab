 package javaInterviewQuestions;

import java.util.Scanner;

public class CheckBinary {
	
public static void main(String[] args) {
		
		System.out.println("enter a number to check");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		boolean isBinary=true;
		while(temp!=0){
			num=temp%10;
			if(num>1){
				isBinary=false;
				break;
			}
			else{
				temp=temp/10;
				
			}
				
		}
		if(isBinary){
			System.out.println("Given number is binary");
		}
		else
			System.out.println("Not a binary number");

	}


}
