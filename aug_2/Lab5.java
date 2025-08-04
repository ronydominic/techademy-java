package aug2.pack1;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter a number: ");
		
		num = scan.nextInt();
		if(num > 0) {
			System.out.println("The number is a positive number");
		} else if(num < 0) {
			System.out.println("The number is a negative number");
		} else {
			System.out.println("It is zero");
		}
		

	}

}
