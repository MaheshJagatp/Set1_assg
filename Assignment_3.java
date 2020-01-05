package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_3 {

	public static void main(String[] args) {
		Assignment_3  obj = new Assignment_3();
		obj.array();
		
	}
	
	public void array() {
		
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("enter the limit for array ");
		int b=s.nextInt();
		int [] a= new  int [b];
		System.out.println("enter the values for first array");
		for(int i=0;i<b;i++) {
			
			a [i] =s.nextInt();
			}
		System.out.println(Arrays.toString(a));
	
		
		
		
		System.out.println("enter the limit for array ");
		int m=s.nextInt();
		int [] p= new  int [m];
		System.out.println("enter the values for first array");
		for(int i=0;i<m;i++) {
			
			p [i] =s.nextInt();
			}
		System.out.println(Arrays.toString(p));

	
		
	int sum=0;
		for(int r=0;r<a.length;r++) {
			
			for( int w=0;w<p.length;w++) {
				if(a[r]==p[w]) {
				
					System.out.println(a[r]);
					sum=sum+a[r];
				}
				
			}
		
		}
		System.out.println("sum is-->>"+sum);
	
	}
}


