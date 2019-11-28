package dateclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	
	public static void main(String args[])
	{
		Date d = new Date();
		
		System.out.println(d.getDate());
		
		System.out.println(d.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println(sdf.format(d));
		
		Calendar c = Calendar.getInstance();
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.getWeekYear());
		
		
	}
	
}
