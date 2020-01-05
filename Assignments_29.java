package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments_29 {

	public static void main(String[] args) {
		
		Assignments_29 obj = new Assignments_29();
		obj.removeElement();

	}
	
	public void removeElement() {
		
		Scanner s = new Scanner(System.in);
		int count=0;

		System.out.println("enter the limit for array ");
		int b=s.nextInt();
		int [] a= new  int [b];
		System.out.println("enter the values for first array");
		for(int i=0;i<b;i++) {
			
			a [i] =s.nextInt();
			}
		System.out.println(Arrays.toString(a));
		
		System.out.println("Enter the element you want to remove");
		int remove=s.nextInt();
		
		for(int j=0;j<a.length;j++) {
			
			if(a[j]==remove) {
				for(int k=j;k<a.length-1;k++) {
					a[k]=a[k]+1;
				}
				count++;
				break;
			}
			
		}
		if(count==0) {
			System.out.println("Element is not found");
		}else {
			
			System.out.println("after deleting new array is-->>");
			
			 for(int m=0; m<a.length-1; m++)
	           {
	               System.out.print(a[m]+ " ");
	           }
		}
		
		
		
		
	}
	
	
	

}
