package Assignments;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Assignments_19 {
/*not checked yet date correctly*/
	public static void main(String[] args) throws ParseException {
		Assignments_19 obj=new Assignments_19();
		obj.Dateformat();
	}

	public void Dateformat() throws ParseException {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the date  in format dd/mm/yyyy");
		String date=s.nextLine();
		
		try {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		Date date1 = formatter.parse(date);
		System.out.println("valid");
		}catch(Exception e) {
			System.out.println("invalid");
		}
		
	}
	
	
}
