package Assignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignments_35 {

	public static void main(String[] args) {
		
		Assignments_35 obj = new Assignments_35();
		obj.checkIp();

	}
	
	public  void checkIp() {
		Scanner s = new Scanner(System.in);
		int token;
		Boolean a=true;
		System.out.println("Enter the IP address");
		String ipname =s.nextLine();
		
		StringTokenizer st =new StringTokenizer(ipname,".");
		while(st.hasMoreTokens()) {
			//System.out.println(st.nextToken());
			 token =Integer.parseInt(st.nextToken());
			if(token>=0 && token<=255) {
				
				a=true;
			}else {
				a=false;
			}
		}

		if(a) {
			System.out.println("enter correct ip address");
		}else {
			System.out.println("enter between 0 to 255");
		}
		
		
		
	}
	

}
