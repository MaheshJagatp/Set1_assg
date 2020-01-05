package Assignments;

import java.util.Scanner;

public class Assignments_37 {

	public static void main(String[] args) {
	
		Assignments_37 obj=new Assignments_37();
		obj.encryption();

	}
	
	public void encryption() {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the string");
	String password =s.nextLine();
	String s1="";
	char c;
	
	for(int i=0;i<password.length();i++) {
		c=password.charAt(i);
		if(i%2!=0) {
			if(c=='z') {
				s1=s1+'a';
			}
			else if(c=='Z') {
				s1=s1+'A';
			}
			
			else {
				s1=s1 + (char)(c+1);
			}
		}
		else {
			s1=s1+c;
		}
		
	}
		System.out.println(s1);
	}
	

}
