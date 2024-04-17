import java.util.*;

class LongestIncreasingSubsequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> vec = new Vector<Integer>();
        for (int i = 0; i < n; i++)
            vec.add(sc.nextInt());
        System.out.println(longestIncreasingSubsequence(vec));
    }

    public static int helper(int i, int n, Vector<Integer> vec, int[] dp) {
        if (i == n)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int maxLen = 1; // Minimum length of increasing subsequence is 1
        for (int j = i + 1; j < n; j++) {
            if (vec.get(j) > vec.get(i)) {
                int len = 1 + helper(j, n, vec, dp);
                maxLen = Math.max(maxLen, len);
            }
        }
        dp[i] = maxLen;
        return dp[i];
    }

    public static int longestIncreasingSubsequence(Vector<Integer> vec) {
        int n = vec.size();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, helper(i, n, vec, dp));
        }

        return maxLen;
    }
}
