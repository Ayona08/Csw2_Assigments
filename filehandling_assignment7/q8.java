package filehandaling;

import java.io.File;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the current file name: ");
            File currentFile = new File(scanner.nextLine());

            if (!currentFile.exists()) {
                System.out.println("The specified file does not exist.");
                return;
            }

            System.out.print("Enter the new file name: ");
            File newFile = new File(scanner.nextLine());

            if (newFile.exists()) {
                System.out.println("A file with the new name already exists.");
                return;
            }

            if (currentFile.renameTo(newFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename the file.");
            }
        }
    }
}

