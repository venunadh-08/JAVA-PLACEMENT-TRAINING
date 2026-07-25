import java.util.*;
class atm{
    static int p;
    public atm(){
    }
    public atm(int Amt){
        this.p = Amt;
        System.out.println("Principle Amount is : "+ Amt+"Rs/-");
    }
    public atm(int Amt,char T){
        if(T == 'W'){
            System.out.println("You have Withdrawn : "+ Amt+"Rs/-");
        }
        else if (T == 'D'){
            this.p = this.p + Amt;
            System.out.println("You have Deposited: "+ Amt+"Rs/-");
        }

    }
    public atm(char T){
        System.out.println("Balance Amount is : "+this.p);
    }
}
class ATMprg{
    static atm d;
    static int n,p = 0;
    static void options(){
        System.out.print("\n\t\tMENU\n\t--------------\n\t 1 . Deposit\n\t 2. Withdraw \n\t 3. Balance \n\t 4. Quit\nSelect One Option : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if(n==1){
            System.out.print("\nEnter Amount to Deposit : ");
            p = sc.nextInt();
            d = new atm(p,'D');
            options();
        }
        else if(n == 2){
            System.out.println("\nEnter Amount to Withdraw : ");
            p = sc.nextInt();
            d = new atm(p,'W');
            options();
        }
        else if (n == 3){
            d = new atm('B');
            options();
        }
        else if (n == 4){
            System.exit(0);
        }
    }
    public static void main(String args[]){
        atm d;
        Scanner sc = new Scanner(System.in);
        d = new atm();
        System.out.print("\nEnter Principle Amount : ");
        p = sc.nextInt();
        d = new atm(p);
        options();
    }
}