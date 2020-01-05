package Assignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignments_39 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 =s.nextLine();
		String s2="";
		StringTokenizer st =new StringTokenizer(s1,"-");
		while(st.hasMoreTokens()) {
			s2=s2+st.nextToken();
			
		}
		
	//	System.out.println(s2);
		StringBuffer sb=new StringBuffer(s2);
		
		sb.insert(2, '-');
		sb.insert(5, '-');
		sb.insert(9, '-');
		System.out.println(sb);

	}

}
