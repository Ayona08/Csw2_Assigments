package filehandaling;
   
import java.io.*;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        File file = new File("diary.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The diary file does not exist.");
        }
    }
}

