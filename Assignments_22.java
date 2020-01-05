package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments_22 {

	public static void main(String[] args) {

		Assignments_22 obj = new Assignments_22();
		obj.commonelement();

	}

	public void commonelement() {
		Scanner s = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the limit for first Array Element");
		int a = s.nextInt();
		System.out.println("Enter the array elements");
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = s.nextInt();
		}
		System.out.println("Array is-->> " + Arrays.toString(b));

		System.out.println("Enter the limit for Second Array Element");
		int q = s.nextInt();
		System.out.println("Enter the array elements");
		int[] c = new int[q];
		for (int j = 0; j < q; j++) {
			c[j] = s.nextInt();
		}
		System.out.println("Array is-->> " + Arrays.toString(c));

		System.out.println("Common element is-->> ");
		for (int z = 0; z < b.length; z++) {

			for (int x = 0; x < c.length; x++) {

				if (b[z] == c[x]) {
					count = count + 2;

					System.out.print(" " + b[z] + " " + c[x]);
				}

			}

		}
		System.out.println("");
		System.out.println("Common element count is " + count);

	}

}
