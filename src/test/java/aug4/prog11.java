package aug4;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class prog11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date in yyyy-mm-dd format");
		String dt = scan.nextLine();
		
		try{
			LocalDate inputDate = LocalDate.parse(dt);
			LocalDate currentDate = LocalDate.now();
			
			
			Period period = Period.between(inputDate, currentDate);			
			int years = Math.abs(period.getYears());
			int months = Math.abs(period.getMonths());
			int days = Math.abs(period.getDays());
			System.out.println(years + " Years, " + months + " Months, " + days + " Days");
		}
		catch(Exception e) {
			System.out.println("Invalid date format");
		}
	}

}
