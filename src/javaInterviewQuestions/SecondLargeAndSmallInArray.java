package javaInterviewQuestions;

import java.util.Arrays;

public class SecondLargeAndSmallInArray {

	public static void main(String[] args) {
		int a[] = { 5, 45, 3, 0, 7, 8, 10 }; // if largest and smallest nos are in middle
		
		int largest = a[0];
		int smallest = a[0];
		int secondLarge = a[0];
		int SecondSmall = a[0];
		System.out.println(a.length);

		// Time complexity is O(n)
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLarge = largest;
				largest = a[i];
			} else if (a[i] > secondLarge) {
				secondLarge = a[i];
			}

			if (a[i] < smallest) {
				SecondSmall = smallest;
				smallest = a[i];
			}
			else if (a[i] < SecondSmall) {
				SecondSmall = a[i];
			}
		}
		System.out.println("Given Array is:: " + Arrays.toString(a));
		System.out.println("Largest Num is:: " + largest);
		System.out.println("Second Largest Num is:: " + secondLarge);
		System.out.println("Smallest Num is:: " + smallest);
		System.out.println("Second Smallest Num is:: " + SecondSmall);
	}

}
