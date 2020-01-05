package Assignments;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Assignment_11 {

	public static void main(String[] args) {
	
		Assignment_11 obj = new Assignment_11();
		obj.ArrayString();
		
		
	}

	public void ArrayString() {
		Scanner s = new Scanner(System.in);

		System.out.println("enter the limit for array ");
		int b=s.nextInt();
		String [] a= new  String [b];
		System.out.println("enter the values for first array");
		for(int i=0;i<b;i++) {
			
		a[i]=s.next();
			}
		System.out.println(Arrays.toString(a));
		String temp= new String();
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i].compareTo(a[j])<0) {
					  temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}	
					
				}
				
			
		
		}
			System.out.println("Sorted Array is--->>  "+Arrays.toString(a));
			
		
		System.out.println("enter the string to search");
		String s1=s.next();
		System.out.println("Enter String is--->>>  "+s1);
		
		for(int w=0;w<a.length;w++) {
			
		if(s1.equals(a[w])) {
				System.out.println("given string is found at "+(w));
		}
			
			
				
			
		}
			
		
	}
	
	}

