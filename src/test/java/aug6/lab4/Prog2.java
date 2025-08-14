package aug6.lab4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        String filename = "src/test/java/aug6/lab4/p2.txt";
        try (Scanner scanner = new Scanner(new File(filename))) {
            scanner.useDelimiter(",");

            System.out.println("Even numbers :");
            while (scanner.hasNext()) {
               
                int num = Integer.parseInt(scanner.next().trim());
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
