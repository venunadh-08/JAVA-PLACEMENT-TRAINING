import java.util.Scanner;
class Emp{
    String empid = "E100";
    String empname = "XYZ";
    void input(String eid,String ename) { // parameter
        empid = eid;
        empname = ename;
    }

    void display(){ // default method
        System.out.println("EmpId :" + empid + " Empname : " + empname);
}
// class car{
//     String carmodel;
//     String color;
//     String price;
// }
}
class july8{
    public static void main(String args[]){
        // car c = new car();
        // c.carmodel = "BMW";
        // c.color = "white";
        // c.price = "1C";
        System.out.println(new Emp());
        System.out.println(new Emp());
        System.out.println(new Emp().empid);
        System.out.println(new Emp().empname);
        Emp e = new Emp();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUmber : ");
        String eid = sc.next();
        System.out.println("Enter Name : ");
        String ena = sc.next();
        e.input(eid,ena); //calling methods - arguments
        e.display();
        // System.out.println(c.carmodel+" - "+c.color+"-"+c.price);
    }
}