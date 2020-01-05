package Assignments;

import java.util.Scanner;

public class Assignments_26 {

	public static void main(String[] args) {
		Assignments_26 obj  =new Assignments_26();
		obj.repeated();
	}

	public void  repeated() {
		int count =0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		String s2="";
		
		
		for(int i=0;i<s1.length()-1;i++) {
		if(s1.charAt(i)==s1.charAt(i+1)) {
			
			
		}else {
			count++;
		}
		
		}
		System.out.println("No of character which are of repeated-> "+count);
		
		
	}
	
	
}
