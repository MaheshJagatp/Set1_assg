package Assignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignments_31 {

	public static void main(String[] args) {
		Assignments_31 obj = new Assignments_31();

		obj.stringAction();

	}

	public static void stringAction() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the your name");
		String name = s.nextLine();

		StringTokenizer st = new StringTokenizer(name, " ");
		System.out.print(st.nextToken());
		System.out.print(",");
		System.out.print(st.nextToken().substring(0, 1));

	}

}
