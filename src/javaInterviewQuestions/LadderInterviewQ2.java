package javaInterviewQuestions;

/* Nutanix INT: 
 Consider a given Number N, You have to print ladder for that if possible. 
 If ladder structure is possible then print the ladder else print -1
 eg: number = 6
   6	
   5	4	
   3	2	1
  
 number = 9
 Ladder is not possible 
 */
public class LadderInterviewQ2 {

	public static void main(String[] args) {
		int number=15;
		int sum =0;
		int p=1;
		for(int i=0; i<=number; i++) {
			sum = sum +i;
			if(sum>number) {
				System.out.println("Ladder not possible -1");
				break;
			}
			
			if(sum==number) {
				for(int k=1; k<=number; k++) {
					for(int j=1; j<=k; j++) {
						System.out.print(number+"	");
						number--;
					}
					System.out.println();
				}
			}
			
//			Reverse ladder			
//			if(sum==number) {
//				for(int k=1; k<=number; k++) {
//					for(int j=1; j<=k; j++) {
//						System.out.print(p+"	");
//						p++;
//						number --;
//					}
//					System.out.println();
//				}
//			}
		}

	}

}
