class Emp{
    static String empid;
    static String empname;
    private static Emp e = new Emp();
    public static Emp newinstance(String eid,String na){
        empid = eid;
        empname = na;
        return e;
    }
    void display(){
        System.out.println(e+"\nEmp Id : " + empid + "-Emp Name :" + empname);
    }
}

class main2{
    public static void main(String args[]){
        Emp e1 = Emp.newinstance("E001","ABC");
        e1.display();
        e1 = Emp.newinstance("E002","XYZ");
        e1.display();
    }
}