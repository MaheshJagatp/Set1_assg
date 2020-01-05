package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_4 {

	public static void main(String[] args) {
		Assignment_4 ai = new Assignment_4();
		ai.ArrayIndex();

	}
	
	
	public void ArrayIndex() {
Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("enter the limit for array ");
		int b=s.nextInt();
		int [] a= new  int [b];
		System.out.println("enter the values for first array");
		for(int i=0;i<b;i++) {
			
			a [i] =s.nextInt();
			}
		System.out.println(Arrays.toString(a));
		
		int sub=0, max=0;
		for(int i=0 ; i< b; i++) {
			
			if(i+1<b) {
				
				sub=a[i] - a[i+1];
				
				System.out.println(a[i]+"-"+a[i+1]+"="+max);
				if (sub < max) {
					max=sub;
					
				}
			}
			
				
			}System.out.println("Max Element is --- >>"+ max);
			
		}
	
	}


