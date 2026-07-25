class prg15{
    public static void main(String args[]){
        int num = 1234;
        char ch[] = String.valueOf(num).toCharArray();
        for(char c : ch){
            System.out.println(c+" - KLU");
        }
    }
}