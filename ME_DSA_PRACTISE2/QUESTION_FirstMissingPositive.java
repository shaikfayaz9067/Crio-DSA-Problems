import java.util.*;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if (nums.length == 0) {
            return 1;
        }
        
        boolean[] res = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                res[nums[i]] = true;
            }
        }

        for (int i = 1; i < res.length; i++) {
            if (!res[i]) {
                return i;
            }
        }
        
        return nums.length + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; ++i) {
            nums[i] = in.nextInt();
        }
        int result = new FirstMissingPositive().firstMissingPositive(nums);
        System.out.println(result);
    }
}
