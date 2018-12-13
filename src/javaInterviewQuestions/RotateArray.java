package javaInterviewQuestions;

import java.util.Arrays;

//Java program to rotate an array by  
//d elements  

class RotateArray {
	/* Function to left rotate arr[] of size n by d */
	void leftRotate(int arr[], int d, int n) {
		
		int j, temp;
		
		for (int i = 0; i < d; i++) { 
			temp = arr[0];
			for (j = 0; j < n - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = temp;
		}
	}

void rightRotate(int arr[], int d, int n) {
		
		int j, temp;
		
		for (int i = 0; i < d; i++) { 
			temp = arr[n-1];
			for (j = n-1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = temp;
		
		}
	}
	
	/* utility function to print an array */
	void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
		
		rotate.printArray(arr, 7);
		System.out.println();
		rotate.leftRotate(arr, 2, 7);
		rotate.rightRotate(arr1, 2, 7);
		rotate.printArray(arr, 7);
		System.out.println();
		rotate.printArray(arr1, 7);
	}
}