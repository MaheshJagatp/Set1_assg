package Assignments;

import java.util.Scanner;

public class Assignments_36 {

	public static void main(String[] args) {
		
		Assignments_36 obj = new Assignments_36();
		obj.conString();

	}
	
	public void conString() {
		
		int count=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String s1=s.nextLine();
		
		
		for(int i=0;i<s1.length()-2;i++) {
		
		
			if(s1.charAt(i)==s1.charAt(i+1)&&s1.charAt(i)==s1.charAt(i+2)) {
				count++;
			//System.out.println(count);	
			
			
			}
	
		}
		
			System.out.println("find three consecutive  charcter "+count+" times" );
		
		
	}

}
