class prg14{
    public static void main(String args[]){
        int a = 60;
        int b = 13;
        int c;
        c = a & b; // 12
        System.out.println("a & b = " + c );    
        c = a | b; // 61
        System.out.println("a | b = " + c );
        c =  a ^ b; // 49
        System.out.println("a ^ b = " + c );
        c = ~a; // -61
        System.out.println("~a = " + c );
    }
}