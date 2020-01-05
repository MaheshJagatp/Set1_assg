package Assignments;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignments_12 {

	public static void main(String[] args) {
		Assignments_12 obj = new Assignments_12();
		obj.timeOp();

	}

	public void timeOp() {
		Scanner s = new Scanner(System.in);
		String a1 = null, a2 = null, a3 = null, a4 = null;
		System.out.println("Enter the time");
		String time = s.nextLine();

		StringTokenizer st = new StringTokenizer(time, ":");
		while (st.hasMoreTokens()) {

			a1 = st.nextToken();
			// System.out.println(a1);
			a2 = st.nextToken();
			// System.out.println(a2);

			StringTokenizer st1 = new StringTokenizer(a2, " ");
			while (st1.hasMoreTokens()) {
				a3 = st1.nextToken();
				// System.out.println(a3);
				a4 = st1.nextToken();
				// System.out.println(a4);

			}

		}

		int aa1 = Integer.parseInt(a1);

		int aa3 = Integer.parseInt(a3);

		if (aa1 <= 12 && aa3 <= 59 && a4.equals("am") || a4.equals("pm")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
