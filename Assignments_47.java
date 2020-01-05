package Assignments;

import java.util.HashMap;
import java.util.Scanner;

public class Assignments_47 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the limit");
		int l = s.nextInt();
		int count=0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < l; i++) {
			System.out.println("enter keys");
			int h1 = s.nextInt();
			System.out.println("enetr values");
			int h2 = s.nextInt();

			hm.put(h1, h2);
			if(h1%4!=0) {
				count++;
			}

		}System.out.println("The keys which is not divisible by 4 are--> "+count);

	}

}
