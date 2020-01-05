package Assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Assignments_8 {

	public static String main(String[] args) throws ParseException {
		
		@SuppressWarnings("deprecation")
		Date date1=new Date(14-10-2019);
		SimpleDateFormat sdf =new SimpleDateFormat("EEEE");
		String s1;
		s1=sdf.format(date1);
		
		return s1;
				
		
	}
	

}
