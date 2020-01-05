package Assignments;

import java.util.Scanner;

public class Assignments_18 {

	public static void main(String[] args) {
		Assignments_18 obj =new Assignments_18();
		obj.opstring();
	}

	
	
	public void opstring() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the first String");
		String a=s.nextLine();
		System.out.println("Enter the second String");
		String b=s.nextLine();
		
		if(a.length()==b.length()) {
			String c=a.concat(b);
			System.out.println("cancated String is-->>"+c);
		}
		
		else{
		 if(a.length()>b.length()) {
			 int x=a.length()-b.length();
			 
			 	String z= a.substring(x, a.length());
				String w=z.concat(b);
				System.out.println("cancated String is-->>" +w);
			 
			 
		 }else {
			 int y=b.length()-a.length();
			 String d=b.substring(y,b.length());
			 String g=a.concat(d);
			 System.out.println("cancated String is-->>" +g);
			 
			 
		 }

			
		}
		
	}
	
	
}
