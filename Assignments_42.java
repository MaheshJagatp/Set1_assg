package Assignments;

import java.util.Scanner;

public class Assignments_42 {

	public static void main(String[] args) {
		Assignments_42 obj= new Assignments_42();
		obj.stringop();

	}
	public void stringop() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine().toLowerCase();
		StringBuffer sb=new StringBuffer(s1);
		StringBuffer sb1=new StringBuffer();		
		
		
		
		
		for(int i=0;i<sb.length();i++) {
			char c=sb.charAt(i);
			if(i%2==0) {
				sb1=sb1.append(c);
			}else {
				 if(c!='a' && c!='e' && c!='i'&& c!='o'& c!='u') {
					 sb1=sb1.append(c);
					}
					
			
			
			}
		}
		System.out.println("output=>> "+sb1);
	}
	

}




/*for(int i=0;i<sb.length();i++) {
System.out.println("outer");
if(i%2!=0) {
	System.out.println("inner");
	char c=sb.charAt(i);
	 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		 System.out.println("mostinner");
		op.deleteCharAt(i);
		
		
	}

}


}*/
