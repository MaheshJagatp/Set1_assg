package Assignments;

import java.util.Scanner;

public class Assignments_45 {

	public static void main(String[] args) {

		Assignments_45 obj = new Assignments_45();
		obj.nonPrime();
	}

	public void nonPrime() {
		int sum = 0;
		int i = 2;
		Scanner s = new Scanner(System.in);
		
		/*System.out.println("Enter the first limit ");
		
		int limit = s.nextInt();
	System.out.println("Enter second limitt");
	int s2=s.nextInt();
		*/
		int limit=10;
		int s2=20;
		
		System.out.println(0);
		System.out.println(1);
		for (i = limit; i <= s2; i++) {

			
			for (int j = limit; j <= i/2 ; ++j) {
				
				if (i % j == 0) {

					System.out.println(i);
					sum = sum + i;

					break;
				}
			}

		}
		System.out.println("sum is--> " + sum);

	}

}
