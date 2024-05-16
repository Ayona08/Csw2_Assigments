package filehandaling;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class q9{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the file name: ");
            File file = new File(scanner.nextLine());

            if (!file.exists()) {
                System.out.println("The specified file does not exist.");
                return;
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getAbsolutePath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + dateFormat.format(file.lastModified()));
            System.out.println("Is Readable: " + file.canRead());
            System.out.println("Is Writable: " + file.canWrite());
            System.out.println("Is Executable: " + file.canExecute());
        }
    }
}

