package javaInterviewQuestions;

import java.util.Arrays;

public class LargeSmallElementArray {

	public static void main(String[] args) {
		int a[] = {-10,45, 3, 7, 8, 10};
		int largest = a[0];
		int smallest = a[0];
		a[5]=11;
		System.out.println(a.length);
		
		
		
		//Time complexity is O(n)
		for (int i=0; i<a.length; i++) {
			if(a[i]>largest) {
				largest = a[i];
			}else if(a[i]<smallest) {
				smallest = a[i];
			}
		}
		
		System.out.println("Given Array is:: "+ Arrays.toString(a));
		System.out.println("Largest Num is:: "+largest);
		System.out.println("Smallest Num is:: "+smallest);
		

	}

}
