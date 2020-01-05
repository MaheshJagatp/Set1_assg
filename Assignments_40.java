package Assignments;

import java.util.Scanner;

public class Assignments_40 {

	public static void main(String[] args) {
		
		Assignments_40 obj = new Assignments_40();
		obj.stringRev();
		
	}
	
	public void stringRev() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String s1=s.nextLine();
		
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		System.out.println("1st input");
		int i=s.nextInt();
		System.out.println("2nd input ");
		int j=s.nextInt();
		
		String s2=sb.substring(i, j);
		System.out.println("String is--> "+s2);
 
				
				
				
	}

}
