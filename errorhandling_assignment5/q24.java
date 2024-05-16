import java.io.*;

public class q24 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("nonExistentFile.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            System.out.println("Read line: " + line);
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read.");
        }
    }
}

