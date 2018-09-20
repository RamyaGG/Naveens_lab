package CollectionsSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		int a[] = new int[3]; // static array. I can store only three values . Size is fixed
		// a[3] = 40; array index out of bound exception will occur here.
		// dynamic array -- . ArrayList

		ArrayList ar = new ArrayList(); // this is called non GenericarrayList objects . We can store string , double,
										// int, boolean also
		// 1. it can contain duplicate values also
		// 2. It maintains insertion order
		// 3. It is not Synchronized . i.e it is not Thread Safe w.r.t Multithreading
		// concept. Thats why ArrayList is slow
		// 4. It allows random access to fetch the elements because it stores the values
		// on the basis of indexes

		ar.add(10); // 0
		ar.add(20); // 1
		ar.add(30); // 2

		System.out.println(ar.size());

		ar.add(40);
		ar.add(50);
		ar.add(50);

		ar.add(12.33);
		ar.add("test");
		ar.add(false);

		System.out.println(ar.size());

		System.out.println(ar.get(4)); // to get the values from an index

		// How to print all the values
		// 1. for loop
		// 2. using iterator

		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i) + " ");
		}

		// Non Generics vs Generics

		ArrayList<Integer> arr = new ArrayList<Integer>(); // Generics Concept in Java

		// arr.add("test"); not possible. It will give error

		arr.add(100);
		arr.add(200);

		ArrayList<String> arr1 = new ArrayList<String>();

		arr1.add("test");
		arr1.add("Selenium");

		System.out.println(arr1);

		// ArrayList<E> arr3 = new ArrayList<E>();

		// Employee Class Objects

		Employee e1 = new Employee("ramya", 25, "qa");
		Employee e2 = new Employee("tom", 28, "dev");
		Employee e3 = new Employee("peter", 23, "admin");

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		// iterator to traverse the values
		// INT :: How to Store specific the user defined class object in ArrayList

		Iterator<Employee> it = list.iterator(); // it does not work on the basis of indexes
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		System.out.println("********************************");

		// addAll()

		ArrayList<String> ar3 = new ArrayList<String>();

		ar3.add("Test");
		ar3.add("Selenium");
		ar3.add("QTP");

		ArrayList<String> ar4 = new ArrayList<String>();

		ar4.add("Dev");
		ar4.add("Java");
		ar4.add("JavaScript");
		//ar4.remove("Dev");

		ar3.addAll(ar4); // To merger two array List. Adding second list in first List

		for (int i = 0; i < ar3.size(); i++) {
			System.out.println(ar3.get(i));

		}
		
		System.out.println(ar3);
		System.out.println("********************************");

		// RemoveAll
		ar3.removeAll(ar4);
		
		for (int i = 0; i < ar3.size(); i++) {
			System.out.println(ar3.get(i));

		}

		System.out.println("********************************");

		// retainAll : Comman Part if you want to check

		ArrayList<String> ar5 = new ArrayList<String>();

		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");

		ArrayList<String> ar6 = new ArrayList<String>();

		ar6.add("Test");
		ar6.add("Java");

		ar5.retainAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));

		}

	}

}
