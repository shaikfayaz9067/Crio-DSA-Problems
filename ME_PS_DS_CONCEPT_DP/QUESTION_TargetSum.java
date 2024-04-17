import java.util.*;

class TargetSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(targetSum(nums, target));
        sc.close();
    }

    public static int helper(int i, int n, int sum, int[] nums, int target, int[][] dp) {
        if (i == n) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        if (dp[i][sum + 1000] != -1) {
            return dp[i][sum + 1000];
        }

        int plus = helper(i + 1, n, sum + nums[i], nums, target, dp);
        int minus = helper(i + 1, n, sum - nums[i], nums, target, dp);

        dp[i][sum + 1000] = plus + minus;

        return dp[i][sum + 1000];
    }

    static int targetSum(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n][2001]; // dp array size increased to accommodate negative sum indices
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return helper(0, n, 0, nums, target, dp);
    }
}
