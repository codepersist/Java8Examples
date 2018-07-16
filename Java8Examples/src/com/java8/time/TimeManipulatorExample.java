package com.java8.time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class TimeManipulatorExample {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate localDate = LocalDate.now();
		System.out.println(dtf.format(localDate));
		
		/* Finding Second Sunday of Next Month */
		LocalDate ldt = localDate.plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
		System.out.println(dtf.format(ldt));
	}
}
