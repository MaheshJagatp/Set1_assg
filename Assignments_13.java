package Assignments;

import java.util.Scanner;


/*sum is not priniting as per prgm*/

public class Assignments_13 {

	public static void main(String[] args) {
		Assignments_13 obj= new Assignments_13();
		obj.pali_num();

	}

	
	public void pali_num() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first limit numbet");
		int a = s.nextInt();
		System.out.println("Enter the second limit number");
		int b=s.nextInt();
		
		
		
		for (int i=a;i<=b;i++) {
			int r=0,n3=i,sum=0;
			
			while(n3!=0) {
				r=(r*10)+(n3%10);
			
				n3=n3/10;
				
				}

			if(r==i) {
				System.out.println("Palindrone number within given reange-->> "+i);
				sum=+i;
				System.out.println("Sum is -->> "+sum);
			}
			
			
					
			
			
			
		}
		
		
	}
	
	
}
