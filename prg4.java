class prg4{
    public static void main(String args[]){
        int a = 5;
        int b;
        System.out.println("a is : "+a);
        b = a++;
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
        b = ++a;
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
        b = a--;
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
        b = --a;
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
    }
}