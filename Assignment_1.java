package Assignments;

import java.util.Scanner;

public class Assignment_1 {


	public static void main(String[] args) {
		Assignment_1 obj = new Assignment_1();
		obj.number();
}

	public void number() {
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the number");
		int i=s1.nextInt();
		int count=0;
		while(i>0) {
			
			int d=i%10;
			if(d%2!=0) {
			System.out.println(d);
			count=count+d;
			}
				
			i=i/10;
			
			if(i==0) {
			System.out.println("Addition of numner is------>"+count);
			}
			
			}
		if(count%2==0) {
			System.out.println("-1");
		}else
			System.out.println("1");
	}


}

