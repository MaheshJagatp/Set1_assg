package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_43 {

	public static void main(String[] args) {
		Assignment_43 obj= new Assignment_43();
		obj.arrayOp();

	}
	
	public void arrayOp() {
		Scanner s = new Scanner(System.in);
		int sum=0,temp;
		System.out.println("enter the limit for array ");
		int b=s.nextInt();
		int [] a= new  int [b];
		System.out.println("enter the values for first array");
		for(int i=0;i<b;i++) {
			
			a [i] =s.nextInt();
			}
		System.out.println(Arrays.toString(a));
		
		
		for(int j=0;j<a.length;j++) {
			if(j%2!=0) {
				
				//System.out.println(a[j]);
				temp=a[j]*j;
				//System.out.println("temp "+temp);
				sum=sum+temp;
				
			}
		}
		System.out.println("Sum of odd array with index number is-> "+sum);
		
		
		
		
		
		
	}
	
	
	
	
}
