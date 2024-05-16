import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q23 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Read line: " + line);
                // Perform processing here
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error: File cannot be read or does not exist.");
        }
    }
}

