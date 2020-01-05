package Assignments;

import java.util.Scanner;

public class Assignments_15 {

	public static void main(String[] args) {
		Assignments_15 obj = new Assignments_15();
		obj.revStr();

	}

	public void revStr() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();

		char[] cha = str.toCharArray();

		for (int i = cha.length - 1; i >= 0; i--) {

			System.out.print(cha[i]);

			System.out.print("-");

		}

	}
}
