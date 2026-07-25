import java.io.Console;
import java.util.Scanner;

public class main3{

    public static String encrypt(String password) {
        String encrypted = "";
        for (int i = 0; i < password.length(); i++) {
            encrypted += (char)(password.charAt(i) + 3);
        }
        return encrypted;
    }

    public static String decrypt(String password) {
        String decrypted = "";
        for (int i = 0; i < password.length(); i++) {
            decrypted += (char)(password.charAt(i) - 3);
        }
        return decrypted;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Console console = System.console();

        System.out.print("Enter the number of users : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] usernames = new String[n];
        String[] passwords = new String[n];

        System.out.println("===============SIGNUP=====================");


        for(int i = 0;i<n;i++){
            System.out.println("\nUser "+(i+1));
            System.out.print("Enter Username : ");
            usernames[i] = sc.nextLine();

            char[] pass = console.readPassword("Enter Password : ");
            String password = new String(pass);
            passwords[i] = encrypt(password);
            System.out.println("User Registered Successfully");
        }

        System.out.println("=====Login=====");
        System.out.print("Enter username : ");
        String name = sc.nextLine();
        char[] pass = console.readPassword("Enter password : ");
        String loginpassword = new String(pass);
        String loginencryptpassword = encrypt(loginpassword);
        boolean found = false;

        for(int i = 0 ; i <n;i++){
            if(usernames[i].equals(name) && passwords[i].equals(loginencryptpassword)){
                found = true;
                break;

            }
        }

        if(found){
            System.out.println("\n Login Successful");
        }
        else{
            System.out.println("\nInvalid Uername or Password");
        }
    }
}
