package javaInterviewQuestions;

import java.util.ArrayList;

public class InterviewQ1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int j=0;
		for(Integer i: list) {
//			list.add(i); //These two are not possible . We can not add values in for each loop.java.util.ConcurrentModificationException
//			list.add(60);
			
			System.out.println(i);
			j++; 
		}
		System.out.println(j);
		System.out.println(list);

	}

}
