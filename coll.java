import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text1: ");
        String text = sc.next();
        int m = text.length();
        int dp[][]= new int[m+1][m+1];
        for(int i = 0;i<m;i++){
            dp[i][i]=1;
            for(int i = 0;j<=n;j++){
                if(text1.charAt(i-1) == text2.charAt(i-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
            }
        }
    }
}