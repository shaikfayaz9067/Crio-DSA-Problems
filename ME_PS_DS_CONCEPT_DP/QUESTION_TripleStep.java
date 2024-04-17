import java.util.*;

class TripleStep {
    long helper(int i, int n, long[] dp){
        if(i == n){
            return 1;
        }
        if(i > n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        long pick = helper(i + 1, n, dp);
        long notpick = helper(i + 2, n, dp);
        long threepick=helper(i+3,n,dp);

        dp[i] = (pick +notpick+threepick)% 1000000007;
        return dp[i];
    }
    
    int numberOfWays(int n) {
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        long res = helper(0, n, dp);
        return (int)res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TripleStep tripleStep = new TripleStep();
        int result = tripleStep.numberOfWays(n);
        System.out.println(result);
        scanner.close();
    }
}
