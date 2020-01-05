package Assignments;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		
		Test obj =new Test();
		int a=obj.minFunction(2,3);
	System.out.println(a);
		
	}
	
	public  int minFunction(int n1, int n2) {
		   int min;
		   if (n1 > n2)
		      min = n2;
		   else
		      min = n1;

		   return min; 
		}
		
	}
	



