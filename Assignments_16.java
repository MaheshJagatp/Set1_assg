package Assignments;

import java.util.HashMap;

import java.util.Scanner;

public class Assignments_16 {

	public static void main(String[] args) {
		Assignments_16 obj=new Assignments_16();
		obj.hashmap();
		

	}
	public void hashmap() {
		Scanner s =new Scanner(System.in);
		System.out.println("enter the limit");
		int l=s.nextInt();
		int sum=0;
		HashMap<Integer, Integer> hm =new HashMap<Integer,Integer>();
		
		for(int i=0;i<l;i++) {
			System.out.println("enter keys");
			int h1=s.nextInt();
			System.out.println("enetr values");
			int h2=s.nextInt();
            
			hm.put(h1, h2);
			
			 if(h1%2==0) {
            	 //System.out.println("even");
			 }else {
				// System.out.println("odd");
				 System.out.println(hm.get(h1));
				 
				 sum+=hm.get(h1);
			 }
			
		}System.out.println(hm);
		System.out.println(sum);
	}		

	
	
	

}



/*
public void Hashmapop() {
	Scanner s=new Scanner(System.in);
	HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
	boolean loopagain= true;
	
	do {
	
	System.out.println("enter registred number");
	int a=s.nextInt();
	System.out.println("enter the marks");
	int b=s.nextInt();
	hash.put(a, b);
	System.out.println("would you like to add extra?  y/n");
	String q=s.next();
	if(q.equals("y")||q.equals("Y")) {
		continue;
	}else {
		break;
	}
	
	}while(loopagain);
		
	System.out.println("Hash Map is-->> "+hash);
	
	
	
	
	
}
*/