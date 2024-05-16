package filehandaling;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        var file = new File("diary.txt");
        try {
            if (!file.exists()) {
                System.out.println("The diary file does not exist. Please create it first.");
                return;
            }
            var writer = new FileWriter(file, true);
            var scanner = new Scanner(System.in);

            System.out.print("Enter your new diary entry: ");
            var entry = scanner.nextLine();
            var now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

            writer.write("\n" + now + " - " + entry + "\n");
            writer.close();
            scanner.close();
            System.out.println("New diary entry added successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending the diary entry.");
            e.printStackTrace();
        }
    }
}

