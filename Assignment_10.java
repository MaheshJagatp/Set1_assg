package Assignments;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_10 {

	public static void main(String[] args) {

		Assignment_10 obj = new Assignment_10();
		obj.alOp();
	}

	public void alOp() {
		Scanner s = new Scanner(System.in);
	

		System.out.println("enter the limit for first arraylist");
		int limit1 = s.nextInt();
		System.out.println("Enter first arraylist values");

		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < limit1; i++) {
			String k = s.next();
			a.add(k);
		}
		System.out.println("First arraylist is--> " + a);

		int sum = 0, temp = 0;
		String name = "";
		for (int i = 0; i < a.size(); i++) {
			String sb = a.get(i);

			StringTokenizer st = new StringTokenizer(sb, "#");
			while (st.hasMoreElements()) {
				name = st.nextToken();
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int z = Integer.parseInt(st.nextToken());

				sum = x + y + z;

			}
			if (temp < sum) {
				temp = sum;
				System.out.println("name is-> " + name);

			}

		}
		System.out.println("total of marks->" + temp);

	}

}