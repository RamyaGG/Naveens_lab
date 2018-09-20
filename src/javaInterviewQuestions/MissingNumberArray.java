package javaInterviewQuestions;

import java.util.Arrays;

public class MissingNumberArray {
	/*Learn How to find Missing Number In Array:

You can do this in O(n). Iterate through the array and compute the sum of all numbers. 
Now, sum of natural numbers from 1 to N, can be expressed as Nx(N+1)/2.

Subtract the sum of the array from Nx(N+1)/2.

That is the missing number*/

	public static void main(String[] args) {
		int a[] = {-1,0,1,2,4,5,6,7};
		
		//1+2+4+5+6+7 = 25
		//1+2+3+4+5+6+7 = 28
		//Missing no = 28-25
		
		int sum = 0;
		int sum1=0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum +a[i];
		}
		
		System.out.println(sum);
		
		for(int i=-1; i<=7; i++) {
			sum1 = sum1+i;
		}
		
		System.out.println(sum1);
		System.out.println("Given Array is ::"+ Arrays.toString(a));
		System.out.println("Missing Number is:: "+(sum1-sum));
	
		
		

	}

}
