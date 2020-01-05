package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignments_28 {

	public static void main(String[] args) {
		Assignments_28 obj = new Assignments_28();
		obj.arrayListOp();
	}

	public void arrayListOp() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit");
		
		int l = s.nextInt();
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("enter values");
		
		for (int i = 0; i < l; i++) {
			String e = s.next();

			al.add(e);
		}
		System.out.println(al);

		System.out.println("enter the input");
		int input = s.nextInt();

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		String sb = "";
		int count = 0, ele = 0;
		for (int i = 0; i < al.size(); i++) {
			sb = al.get(i);
			ele = sb.length();
			al1.add(ele);

		}
		for (int i = 0; i < al1.size(); i++) {
			if (al1.get(input - 1) != al1.get(i)) {
				count++;

			}
		}
		// System.out.println(al1);
		System.out.print(count + " ");
		System.out.print(al.get(input - 1));

	}

}
