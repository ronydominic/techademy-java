package aug4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class prog12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept two LocalDates
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(scanner.nextLine());

        if (date1.isAfter(date2)) {
            LocalDate temp = date1;
            date1 = date2;
            date2 = temp;
        }

        Period period = Period.between(date1, date2);
        int years = Math.abs(period.getYears());
		int months = Math.abs(period.getMonths());
		int days = Math.abs(period.getDays());


		System.out.println(years + " Years, " + months + " Months, " + days + " Days");

    }
}
