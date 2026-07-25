import java.util.Scanner;

public class prg9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char c = sc.next().charAt(0);
        int asciiValue = (int) c;
        if(asciiValue >=65 && asciiValue <=90){
            System.out.println("Character is Uppercase");
        } else if(asciiValue >=97 && asciiValue <=122){
            System.out.println("Character is Lowercase");
        } else if(asciiValue >=48 && asciiValue <=57){
            System.out.println("Character is a Digit");
        } else if ((asciiValue >=33 && asciiValue <=47) || (asciiValue >=58 && asciiValue <=64)
                || (asciiValue >=91 && asciiValue <=96) || (asciiValue >=123 && asciiValue <=126)){
            System.out.println("Character is a Symbol");
        } else {
            System.out.println("Character is neither uppercase nor lowercase nor a digit nor a symbol");
        }
        sc.close();
    }
}