import java.util.Scanner;
class prg12{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No :");
        int no = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Table :");
        int t = sc1.nextInt();
        int i;
        for(i = 1;i<=no;i++){
            System.out.println(t+" * "+i+" = "+(t*i));
        }
    }
}