import java.io.*;
import java.util.*;

class UniquePaths {

    public long helper(int i, int j, long[][] dp){
        if(i==1 && j==1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i<1 || j <1){
            return 0;
        }
        long pick=helper(i-1, j, dp);
        long notpick=helper(i, j-1, dp);
        dp[i][j]=(pick+notpick)%1000000007;
        return dp[i][j];
    }

    public int uniquePaths(int m, int n) {
        long[][] dp=new long[m+1][n+1];
        for(long[] i:dp){
            Arrays.fill(i,-1);
        }
        int res=(int)helper(m,n,dp);
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        int result = new UniquePaths().uniquePaths(m , n); // Corrected order of inputs
        System.out.println(result);
    }
}
