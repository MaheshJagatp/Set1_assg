package Assignments;

import java.util.Scanner;

public class Assignments_14 {

	public static void main(String[] args) {

		Assignments_14 obj = new Assignments_14();
		obj.maxlength();
	}
	
	public void maxlength() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String ");
		String a=s.nextLine();
		System.out.println("Given string is-->> "+a);
		
		int maxlen=0;
		char[] ch=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			
			String f="";
			while(i<a.length() && ch[i]!=' ') {
				
				f=f+ch[i];
				i++;
			}
			
			if(f.length()>0) {
				System.out.println(f +"-->> " +f.length());
			}
			if(f.length()>maxlen) {
				maxlen=f.length();
				System.out.println("max length word is-->> "+f + " with length-->> "+maxlen);
			
		}
		}
		
		
	}
	
	

}
