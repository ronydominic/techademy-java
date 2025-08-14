package aug6.lab4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Prog1 {
    public static void main(String[] args) {
        String filename = "src/test/java/aug6/lab4/p1.txt"; 

        try (
            FileReader reader = new FileReader(filename);
        ) {
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }

            String reversedContent = content.reverse().toString();

            try (FileWriter writer = new FileWriter(filename)) {
                writer.write(reversedContent);
                System.out.println("File content reversed");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
