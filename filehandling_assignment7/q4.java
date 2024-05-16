package filehandaling;
import java.io.File;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified directory does not exist.");
            return;
        }

        File[] files = directory.listFiles();
        System.out.println("Files and subdirectories in " + directoryPath + ":");
        for (File file : files) {
            System.out.println(file.getName());
        }
        scanner.close();
    }
}
