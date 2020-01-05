package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignments_20 {

	public static void main(String[] args) {
		

		Assignments_20 obj = new Assignments_20();
		obj.primein();
	}

	
	public void primein() {
		Scanner s =new Scanner(System.in);
		int sum=0;
		boolean Isprime=false;
		System.out.println("enter the limit for array ");
		int b=s.nextInt();
		int [] a= new  int [b];
		System.out.println("enter the values for first array");
		for( int i=0;i<b;i++) {
			
			a [i] =s.nextInt();
			}
		System.out.println(Arrays.toString(a));
           for(int i=2;i<=b;i++) {
			
			for(int j=2;j<=i/2;++j) {
				if(i%j==0) {
					
					//System.out.println(i);
					
					
					
				}else {
					System.out.println(i);
				}
			}
		
		
			
           }
	}
}
			
		
	



/*for(int i=2;i<=a.length;i++) {


for(int j=2;j<i/2; ++j) {
	
	if(i%j==0) {
		System.out.println("not prime "+i);
	
	}else {
		System.out.println("prime "+i);
		
	}
	
	}*/