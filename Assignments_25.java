package Assignments;

import java.util.Scanner;

public class Assignments_25 {

	public static void main(String[] args) {
		Assignments_25 obj =new Assignments_25();
		obj.Pali();

	}
	
	public void Pali() {
		
	
		int count=0;
		String reverse="";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		int l=s1.length();
		
		for(int i=l-1;i>=0;i--) {
		
			
			 reverse = reverse +s1.charAt(i);			
		}
		
		if(s1.equals(reverse)) {
			System.out.println("String is Palindrone-->> "+s1);
		}
		else {
		System.out.println("String is not Palindrone");
		
		}
		for(int j=l-1;j>=0;j--) {
			char a=s1.charAt(j);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
				 count=+1;
			}
		}
		
		if(count>=2) {
			System.out.println("the Vowels Are "+count);
			
		}
		
	}
	
	
	

}
