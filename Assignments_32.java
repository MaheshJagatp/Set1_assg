package Assignments;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignments_32 {

	public static void main(String[] args) {
		
		Assignments_32 obj = new Assignments_32();
		obj.removeDuplicate();
		
		
		
	}

	public void removeDuplicate() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String name=s.nextLine();
		char [] inp= name.toCharArray();
		
	
		Set<Character> charset = new LinkedHashSet<Character>();
		for(char ch :inp) {
			charset.add(ch);
		}
		StringBuffer sb=new StringBuffer();
		for (char c: charset) {
			sb.append(c);
			
		}
		sb.append("magheg");
		
		System.out.println("output is-->> "+sb.toString());
		
	
	
}
}