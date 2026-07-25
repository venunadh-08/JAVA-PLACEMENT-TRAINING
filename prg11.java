// import java.util.Scanner;
// class prg11{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter No :");
//         int no = sc.nextInt();
//         for(int i = 1;i <= no;i=i+3){
//             System.out.print(i+" ");
//         }
//     }
// }
import java.util.Scanner;
class prg11{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No :");
        int no = sc.nextInt();
        int i,j;
        for(i = 1, j = 1; i <= no && j <= no; i = i + 3, j = j + 2){
            System.out.print("i is :"+i+" - j is :"+j);
        }
    }
}
