package Assignments;

import java.util.Scanner;

public class Assignments_27 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int	flag =0;
		System.out.println("Enter the number");
		String a=s.nextLine();
		String j=a.substring(1,a.length());
		for(int i=0;i<a.length();i++) {
			char z=a.charAt(i);
			if(z=='-'||z=='0'||z=='1'||z=='2'||z=='3'||z=='4'||z=='5'||z=='6'||z=='7'||z=='8'||z=='9') {
				
				if(a.charAt(0)=='-') {
					flag =0;
					
				}else {
					flag=2;
				}
				
				
			
			}
			else {
				System.out.println("-1");
				flag=1;
				break;
			}
			
			
			}
		if(flag==0) {
			System.out.println("converted negetive number is "+j);
		}else if(flag==2) {
			System.out.println("the number is "+a);
		}
		
		
		
		
		
	
		
		
	}

}
