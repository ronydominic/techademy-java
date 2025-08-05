package aug4;

import java.time.LocalDate;
import java.util.Scanner;

public class prog13 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Enter purchase date in yyyy-mm-dd format");
    	String dt = scanner.nextLine();
    	
        LocalDate purchaseDate = LocalDate.parse(dt);
        System.out.println("Enter no of years covering warrany period");
        int years =scanner.nextInt();
        System.out.println("Enter no of months covered under warranty period");
        int months = scanner.nextInt();

        LocalDate expiryDate = purchaseDate.plusYears(years).plusMonths(months);
   
        System.out.println("Purchase Date       : " + purchaseDate);
        System.out.println("Warranty Expiry Date: " + expiryDate);
    }

    
}
