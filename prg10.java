// import java.util.*;

// class Main{
//     public static void main(String args[]){
//         Scanner rd = new Scanner(System.in);
        
//         System.out.print("Enter first number: ");
//         int a = rd.nextInt();
//         System.out.print("Enter second number: ");
//         int b = rd.nextInt();
       
//         System.out.print(a>b ? "First Number is big" : "Second number is big");

//         rd.close();

//     }
// }
// import java.util.*;

// class Main{
//     public static void main(String args[]){
//         Scanner rd = new Scanner(System.in);
//         int a = rd.nextInt(), b = rd.nextInt(), c = rd.nextInt();
//         System.out.println(a >= b ? (a >= c ? a : c) : (b >= c ? b : c));
//     }
// }
// import java.util.*;
// class prg10{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         char c = sc.next().charAt(0);
//         switch(c){
//             case 'a':
//             case 'e':
//             case 'i':
//             case 'o':
//             case 'u':
//             case 'A':
//             case 'E':
//             case 'I':
//             case 'O':
//             case 'U':
//                 System.out.println("It's a vowel.");
//                 break;
//             default:
//                 System.out.println("It's not a vowel.");
//         }
//     }
// }

import java.util.*:
class prg10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month : ");
        String month = sc.nextLine();
        String season;
        switch(month.toLowerCase()){
            case "december":
            case "january":
            case "february":
                season = "winter";
                break;
            case "march":
                season = "spring";
                break;
            case "april":
            case "may":
                season = "summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "rainy";
                break;
            default:
                season = "Invalid month";
        }
        System.out.println(season);
        sc.close();
    }
}