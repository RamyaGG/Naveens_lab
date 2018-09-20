package javaInterviewQuestions;
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/
public class NumberPattern {

	public static void main(String[] args) {
		
		for (int i=1; i<= 5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}

	}

}


/*
 
 1
 2 3
 4 5 6
 7 8 9 10
 
 Write a program toprint Floyd’s triangle.
 
 Scanner sc=new Scanner(System.in);
		System.out.println("enter a range");
		intx=sc.nextInt();
		intp=1;
		for(inti=1;i<=x;i++){
			for(intj=1;j<=i;j++){
				System.out.print(p);
				p++;
			}
			System.out.println();
		}

 */