package aug4;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class prog14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter zone id");
		String zoneIdStr = scanner.nextLine();
		
		 try {
	            ZoneId zoneId = ZoneId.of(zoneIdStr);
	            ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

	            System.out.println("Zone: " + zoneIdStr);
	            System.out.println("Current Date and Time: " + zonedDateTime.format(formatter));
	        } catch (Exception e) {
	            System.out.println("Invalid Zone ID: " + zoneIdStr);
	        }

	}

}
