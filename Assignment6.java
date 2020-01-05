package Assignments;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Assignment6 obj =new Assignment6();
		obj.fib();
	}
	public void fib() {
		int i= 0;
		int j= 1;
		int l,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit for series ");
		int count=s.nextInt();
		
		System.out.print("fibbonacci series is-->> "+ i );
		
		for(int k=1;k<count;k++) {
			l=i+j;
			System.out.print(" "+l);
			
			i=j;
			j=l;
			
			sum=sum+l;
			
		}
		System.out.println();
		System.out.println("addtion of fibbonacci limit is---->> "+sum);
	}

}
