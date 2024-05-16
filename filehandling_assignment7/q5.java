package filehandaling;
import java.io.File;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        var directoryPath = scanner.nextLine();
        var directory = new File(directoryPath);

        if (!directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        var files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        System.out.println("Text files in " + directoryPath + ":");
        for (var file : files) {
            System.out.println(file.getName());
        }
        scanner.close();
    }
}
