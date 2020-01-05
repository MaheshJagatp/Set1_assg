package Assignments;

import java.util.ArrayList;

import java.util.Scanner;

public class Assignmennt_7 {

	public static void main(String[] args) {
		Assignmennt_7 obj = new Assignmennt_7();
		obj.Number();
	}
	
	
	public void Number() {
		ArrayList<Integer> a= new ArrayList<Integer>();
		int result=1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int k = s.nextInt();
		
		for(int i=1;i<=k;i++) {
			
			if(i%2!=0) {
				System.out.println(i);
				a.add(i);
				
			}
			
		}System.out.println(a.toString());
		for(int j=1;j<a.size();j++) {
			if(j%2!=0) {
				result=result+a.get(j);
				System.out.println("+ -> "+result);
				
			}else {
				result=result-a.get(j);
				System.out.println("- -> "+result);
			}
		}System.out.println("result -> "+result);
	
			}
			
		
	}



	