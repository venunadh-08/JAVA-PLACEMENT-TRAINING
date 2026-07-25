import java.util.Scanner;
public class LCS{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        n = nums.length;
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        if(n == 0){
            System.out.println(0);
        }
        int[] dp = new int[n];

        for(int i = 0;i<n;i++){
            dp[i]=1;
        }
        int maxAns = 1;
        // step 2: Fill DP array
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            maxAns = Math.max(maxAns,dp[i]);
        }
        System.out.println("Length of Longest Increasing Subsequence: "+maxAns);
    }
}