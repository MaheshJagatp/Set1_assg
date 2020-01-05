package Assignments;

import java.util.Scanner;

public class Assignments_23 {

	public static void main(String[] args) {
		Assignments_23 obj = new Assignments_23();
		obj.checkPattern();
	}

	public void checkPattern() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first String Pattern");
		String s1=s.nextLine();
		System.out.println("String S1 is->>  "+s1);
		String s1new =s1.replaceAll("[a-z]", " ");
		String s1new1 =s1new.replaceAll("[A-Z]", " ");
		
		
		
		System.out.println("Enter Second String Pattern");
		String s2=s.nextLine();
		System.out.println("String S2 is->>  "+s2);
		String s2new =s2.replaceAll("[a-z]", " ");
		String s2new2 =s2new.replaceAll("[A-Z]", " ");
		
		
		if(s1new1.endsWith(s2new2)) {
			System.out.println("Pattern of Strings is Matched");
		}else {
			System.out.println("Pattern of Strings is not matched");
		}
		
	}
	
	
	
	
}
