// import java.util.ArrayList;

// class main {
//     public static void main(String args[]) {
//         ArrayList<String> lst = new ArrayList<>();
//         lst.add("ABC");
//         lst.add("XYZ");
//         lst.add("QWE");
//         System.out.println("String List : " + lst);
//         ArrayList<Integer> lst1 = new ArrayList<>();
//         lst1.add(100);
//         lst1.add(200);
//         lst1.add(300);
//         System.out.println("Integer List : "+lst1);

//         ArrayList<Object> lst2 = new ArrayList<>();

//         lst2.add(lst1);
//         lst2.add(lst);
//         System.out.println("Mixed List : " + lst2);
//     }
// }

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String names[] = {"aa","bb","cc","dd","ee"};
        List lst = Arrays.asList(names);
        System.out.println("Names as List : "+lst);
    }
}