package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment05 {

	public static void main(String[] args) {
		Assignment05 v = new Assignment05();
		v.Arraylist_1();
	}

	
	public void Arraylist_1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first Arraylist");
		while(s.hasNextInt()) {
			
			list.add(s.nextInt());
		}
		System.out.println("Array list is-->> "+list);
		
		
		
		
		
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Second Arraylist");
		while(s1.hasNextInt()) {
			
			list1.add(s1.nextInt());
		}
		System.out.println("Array list is-->> "+list1);
		
	}
	
}
