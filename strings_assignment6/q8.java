package stringmanipulation;
import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message to encrypt: ");
        String message = scanner.nextLine();
        System.out.print("Enter the encryption key (shift value): ");
        int key = scanner.nextInt();

        String encryptedMessage = encrypt(message, key);
        System.out.println("Encrypted message: " + encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println("Decrypted message: " + decryptedMessage);

        scanner.close();
    }

    private static String encrypt(String message, int key) {
        StringBuilder encrypted = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch))
                encrypted.append((char) (((ch - 'a' + key) % 26) + 'a'));
            else
                encrypted.append(ch);
        }

        return encrypted.toString();
    }

    private static String decrypt(String encryptedMessage, int key) {
        StringBuilder decrypted = new StringBuilder();

        for (char ch : encryptedMessage.toCharArray()) {
            if (Character.isLetter(ch))
                decrypted.append((char) (((ch - 'a' - key + 26) % 26) + 'a'));
            else
                decrypted.append(ch);
        }

        return decrypted.toString();
    }
}

