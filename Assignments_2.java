package Assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Assignments_2 {

	public static void main(String[] args) throws ParseException {

		String date = "3-11-2019";

		SimpleDateFormat sb = new SimpleDateFormat("dd-MM-yyyy");
		Date d = sb.parse(date);
		 
		
		Calendar c = Calendar.getInstance(); 
		c.setTime(d);
		
		int day=c.get(Calendar.NOVEMBER);

		//sb = new SimpleDateFormat("EEEE");
		System.out.println(day);

	}

}
