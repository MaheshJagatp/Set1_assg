package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments_24 {

	public static void main(String[] args) {
		Assignments_24 obj =new Assignments_24();
		obj.Arraypo();
	}

	public void Arraypo() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the limit for array ");
		int b=s.nextInt();
		int [] a= new  int [b];
		System.out.println("enter the values for first array");
		for(int i=0;i<b;i++) {
			
			a [i] =s.nextInt();
			}
		System.out.println(Arrays.toString(a));
	
	for(int j=0;j<a.length;j++) {
		if(j%2==0) {
		int c=	a[j]*a[j];
		System.out.println("square of " +a[j]+" is -> "+c);
		}else {
			int g=a[j]*a[j]*a[j];
			System.out.println("cube of " +a[j]+" is -> "+g);
		}
		
	}
	
	
	
	}
	
	
	
}
