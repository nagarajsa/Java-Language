package Sample_workplace;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class year {
	static void call(int month, int day,int year)
	{
		LocalDate date=LocalDate.of(month, day, year);
		System.out.println(date);
		DayOfWeek day1=date.getDayOfWeek();
		System.out.println(day1);
	}
	
	public static void main(String[] args) {
		int month=3;
		int day=23;
		int year=2000;
		
		call(year,month,day);
		
		
		
	}

}
