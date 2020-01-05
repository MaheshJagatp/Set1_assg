package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments_34 {

	public static void main(String[] args) {
		
		Assignments_34 obj =new Assignments_34();
		obj.checkMaxmin();
		
	}

	
	public void checkMaxmin() {
		int max=0 ;
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the limit for array ");
		int b=s.nextInt();
		int [] a= new  int [b];
		System.out.println("enter the values for  array");
		for(int i=0;i<b;i++) {
			
			a [i] =s.nextInt();
			}
		System.out.println(Arrays.toString(a));
		
		
		for (int i=0;i<a.length;i++) {
		
			if(max < a[i]) {
				max=a[i];
				
			}
			
		}System.out.println("Maximum  number is "+max);
		
	
			
			int  min=a[0];	

		for (int i=0;i<a.length;i++) {
		
			if(min > a[i]) {
				min=a[i];
				
			}
			
		}System.out.println("minimun  number is "+min);
			
		
		int sum =max+min;
		System.out.println("avarge is-->> " +sum/2 );
		
		
	
		
		
	}
}
