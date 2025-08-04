package aug2.pack1;

import java.util.Scanner;

public class Lab10 {

    public static boolean isPositive(String s) {
        s = s.toUpperCase();
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false; 
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scan.next();

        if (isPositive(str)) {
            System.out.println("The string is a positive string.");
        } else {
            System.out.println("The string is NOT a positive string.");
        }
        
        scan.close();
    }
}
