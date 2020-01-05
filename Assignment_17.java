package Assignments;

import java.util.Scanner;

public class Assignment_17 {

	public static void main(String[] args) {
		Assignment_17 obj = new Assignment_17();
		obj.A();
	}
public void A() {
	int m,q,sum=0;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the no-->>");
	int a= s.nextInt();
	
	while(a>0) {
		m=a%10;
		q=m*m;
		System.out.println("Number is -->> "+m+"-->> square is -->> "+q);
		sum=sum+q;
		a=a/10;
		}
		System.out.println("sum of induvisial digiit is-->> "+sum);	
	
	
}
	
	
}
