package datetime;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class TimeBetweenDatesExample {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.now();
		LocalDate dateofJoining = LocalDate.of(2015, Month.AUGUST, 13);   //Random Previous Date
		Period experience = Period.between(dateofJoining,ld);
		System.out.println("Your total experience in organization till date :" + experience.getYears() +  "Years "  + //
		experience.getMonths() + "Months " + experience.getDays() + "Days");
	}
}
