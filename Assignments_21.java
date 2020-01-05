package Assignments;

import java.util.Scanner;

public class Assignments_21 {

	public static void main(String[] args) {
		Assignments_21 obj= new Assignments_21();
		obj.Extension();
		


	}
	public void Extension() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the file name");
		String s1=s.nextLine();
		
		int q=s1.indexOf('.');
		String l=s1.substring(q+1);
		
		boolean b =l.equals("jpeg");
		if (b){
			System.out.println("Valid format");
		}else
		{
			System.out.println("Invalid format");
		}
		
	}
	
	
	

}
