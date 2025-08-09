package aug6;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many products do you want to enter? ");
        int count = input.nextInt();
        input.nextLine();

        String[] productList = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Product " + (i + 1) + ": ");
            productList[i] = input.nextLine();
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (productList[j].compareToIgnoreCase(productList[j + 1]) > 0) {
                    String temp = productList[j];
                    productList[j] = productList[j + 1];
                    productList[j + 1] = temp;
                }
            }
        }

        System.out.println("\nProducts in alphabetical order:");
        for (String product : productList) {
            System.out.println(product);
        }

        input.close();
    }
}
