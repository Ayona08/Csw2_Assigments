package filehandaling;
import java.io.*;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        File file = new File("diary.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(file, true);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your diary entry: ");
            String entry = scanner.nextLine();
            writer.write(java.time.LocalDate.now() + ": " + entry + "\n");
            writer.close();
            scanner.close();
            System.out.println("Diary entry written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
