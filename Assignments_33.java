package Assignments;

import java.util.Scanner;

public class Assignments_33 {

	public static void main(String[] args) {

		Assignments_33 obj = new Assignments_33();
		obj.passwordSet();

	}

	public void passwordSet() {
		int lowercase = 0, uppercase = 0,special=0,digit=0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Password");
		String password = s.nextLine();
		int k = password.length();
		boolean a=false,b=false,c=false,d=false,e=false;
		
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				lowercase++;

			} else {
				uppercase++;

			}
			if(password.charAt(i)=='@'||password.charAt(i)=='#'||password.charAt(i)=='$') {
				special++;
				
			}
			if(Character.isDigit(password.charAt(i))) {
				digit++;
			}

		}
		
		
		

		if (password.length() >= 6 && password.length() <= 20) {
			a=true;
		} 

		if (uppercase > lowercase) {
			b=true;
		} 

		if (Character.isUpperCase(password.charAt(0)) && Character.isLowerCase(password.charAt(k - 1))) {
			c=true;
		} 
		if(special>0) {
			d=true;
		}
		if(digit>0) {
			e=true;
		}
		
		
		if(a&&b&&c&&d&&e==true) {
			System.out.println("password is coorect");
		}else {
			System.out.println("password is wrong");
		}
		
	}

}
