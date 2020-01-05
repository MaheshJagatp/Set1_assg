package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments_46 {

	public static void main(String[] args) {
		Assignments_46 obj =new Assignments_46();
		obj.arrayOp();

	}
	public void arrayOp() {
		Scanner s = new Scanner(System.in);
		int sum =0;	
		System.out.println("enter the limit for array ");
		int b=s.nextInt();
		int [] a= new  int [b];
		System.out.println("enter the values for first array");
		for(int i=0;i<b;i++) {
			
			a [i] =s.nextInt();
			}
		System.out.println(Arrays.toString(a));
		
		System.out.println("Enter the element to set limit");
		int limit=s.nextInt();
		
		for(int j=0;j<a.length;j++) {
			if(a[j]>limit) {
				System.out.println(a[j]);
				sum=sum+a[j];
			}
		}System.out.println("Sum is-> "+sum);
		
		//String reverse= Integer.toString(sum);
		StringBuffer sb =new StringBuffer(Integer.toString(sum)).reverse();
		//sb.reverse();
		System.out.println("reversr is->"+sb );
		
		
	}

}
