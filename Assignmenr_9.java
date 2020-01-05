package Assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Assignmenr_9 {

	public static void main(String[] args) throws ParseException {
		Assignmenr_9 obj = new Assignmenr_9();
		obj.diff_month();

	}

	public void diff_month() throws ParseException {
		String date1 = "1-12-2017";
		String date2 = "2-2-2019";

		SimpleDateFormat sb = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = sb.parse(date1);
		Date d2 = sb.parse(date2);
		
		

	}

}
