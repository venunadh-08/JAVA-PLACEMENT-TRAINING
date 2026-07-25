import java.io.Console;
import java.util.Scanner;

public class Prg17 {

    // Encrypt password using Caesar Cipher (+3)
    public static String encrypt(String password) {
        String encrypted = "";

        for (int i = 0; i < password.length(); i++) {
            encrypted += (char)(password.charAt(i) + 3);
        }

        return encrypted;
    }

    // Decrypt password
    public static String decrypt(String password) {
        String decrypted = "";

        for (int i = 0; i < password.length(); i++) {
            decrypted += (char)(password.charAt(i) - 3);
        }

        return decrypted;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available.");
            System.out.println("Run this program from Command Prompt or Terminal.");
            return;
        }

        System.out.print("Enter number of users: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] usernames = new String[n];
        String[] passwords = new String[n];

        // Signup
        System.out.println("\n===== SIGNUP =====");

        for (int i = 0; i < n; i++) {

            System.out.println("\nUser " + (i + 1));

            System.out.print("Enter Username: ");
            usernames[i] = sc.nextLine();

            char[] pass = console.readPassword("Enter Password: ");
            String password = new String(pass);

            passwords[i] = encrypt(password);

            System.out.println("User Registered Successfully.");
        }

        // Login
        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter Username: ");
        String loginUser = sc.nextLine();

        char[] loginPass = console.readPassword("Enter Password: ");
        String loginPassword = new String(loginPass);

        String encryptedLoginPassword = encrypt(loginPassword);

        boolean found = false;
s
        for (int i = 0; i < n; i++) {

            if (usernames[i].equals(loginUser) &&
                passwords[i].equals(encryptedLoginPassword)) {

                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nLogin Successful");
        } else {
            System.out.println("\nInvalid Username or Password");
        }

        sc.close();
    }
}