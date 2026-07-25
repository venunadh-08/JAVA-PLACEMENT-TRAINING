class prg3{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int c = 30;
        a = a+b+c;
        b = a-b-c;
        c = a-b-c;
        a= a-b-c;
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        System.out.println("c is "+c);
    }
}