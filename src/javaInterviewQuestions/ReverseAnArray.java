package javaInterviewQuestions;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6};
		int length = a.length;
		int[] reverseArray = new int[length];
		
		
		System.out.println("Before Reverse of Array "+Arrays.toString(a));
		int j=0;
		for(int i=length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
			reverseArray[j]=a[i];
			j++;
			
		}
		
		System.out.println("\nAfter Reverse of Array "+Arrays.toString(reverseArray));
		
	}

}
