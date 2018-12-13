package javaInterviewQuestions;

import java.util.Arrays;

//With first number being the Largest or Smallest Number

public class SecondLargeAndSmallInArrayWithFirstNumIsLargeOrSmall {

	public static void main(String[] args) {
		int a[] = { -100, 45, 3, 0, 7, 8, 10 }; // this prg will work for below combinations
	//	int a[] = { 100, 45, 3, 7, 8, 10 };
	//	int a[] = { 45, 100, 3, 7, 8, 10 };
	//	int a[] = { -100, -45, 3, 7, 8, 10 };
	//	int a[] = { -45, -100, 3, 7, 8, 10 };
	//	int a[] = { -100, -45, 3, 7, 45, 100 };
	//	int a[] = { -100, -45, 3, 7, 100, 45 };
	//	int a[] = { 100, 45, 3, 7, -45, -100 };
	//	int a[] = { 100, 45, 3, 7, -100, -45 };
		
		int largest = a[0];
		int smallest = a[0];
		int secondLarge = a[0];
		int SecondSmall = a[0];
		System.out.println(a.length);

		if (a[0] > a[1]) {
			largest = a[0];
			secondLarge = a[1];

		}

		if (a[0] < a[1]) {
			smallest = a[0];
			SecondSmall = a[1];

		}

		// Time complexity is O(n)
		for (int i = 1; i < a.length; i++) {
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
