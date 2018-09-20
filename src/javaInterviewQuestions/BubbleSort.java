 package javaInterviewQuestions;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] arg) {
		int a[] = {23, 1, 4, 8, 0, 5, 12};
		int temp;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
					
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		

	}

}
