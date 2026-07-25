// class prg2{
//     public static void main(String[] args) {
//         int a=10;
//         int b=20;
//         a = a+ b;
//         b = a - b;
//         a = a - b;
//         System.out.println("a is "+a);
//         System.out.println("b is "+b);
//     }
// }
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class prg2{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);
        LocalTime curr = LocalTime.now();
        System.out.println("Current Time: " + curr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DOB (dd-mm-yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dt  = LocalDateTime.parse(sc.nextLine() + " 00:00", formatter);
        System.out.println("Date of Birth : " + dt);
        Period age = Period.between(dt.toLocalDate(), date);
        System.out.println("Age :" + age.getYears() + " Years, " + age.getMonths() + " Months, " + age.getDays() + " Days");

        System.out.println("No of days lived : " + age.toTotalMonths() * 30 + age.getDays());
        System.out.println("No of hours lived : " + (age.toTotalMonths() * 30 + age.getDays()) * 24);
        System.out.println("No of minutes lived : " + (age.toTotalMonths() * 30 + age.getDays()) * 24 * 60);
        System.out.println("No of seconds lived : " + (age.toTotalMonths() * 30 + age.getDays()) * 24 * 60 * 60);

    }
}