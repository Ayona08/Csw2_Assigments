package filehandaling;

import java.io.*;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the source file path: ");
            File sourceFile = new File(scanner.nextLine());

            System.out.print("Enter the destination file path: ");
            File destFile = new File(scanner.nextLine());

            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            if (destFile.exists() && !promptConfirmation(scanner)) {
                System.out.println("Copy operation aborted.");
                return;
            }

            try (FileReader reader = new FileReader(sourceFile);
                 FileWriter writer = new FileWriter(destFile)) {
                int character;
                while ((character = reader.read()) != -1) {
                    writer.write(character);
                }
                System.out.println("File copied successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while copying the file.");
                e.printStackTrace();
            }
        }
    }

    private static boolean promptConfirmation(Scanner scanner) {
        System.out.print("Destination file already exists. Do you want to overwrite it? (Y/N): ");
        String overwriteInput = scanner.nextLine().trim().toUpperCase();
        return overwriteInput.equals("Y");
    }
}

