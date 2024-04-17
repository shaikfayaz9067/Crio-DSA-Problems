import java.util.*;

class MergeIntervals {

    public int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        
        Stack<int[]> stack = new Stack<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        stack.push(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] top = stack.peek();
            
            if (top[1] >= currentInterval[0]) {
                // Merge intervals
                top[1] = Math.max(top[1], currentInterval[1]);
            } else {
                // Add non-overlapping intervals to stack
                stack.push(currentInterval);
            }
        }
        
        int[][] res = new int[stack.size()][2];
        
        // Convert stack to result array
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0; i < n; i++) {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int[][] results = new MergeIntervals().mergeIntervals(nums);

        for (int i = 0; i < results.length; ++i) {
            System.out.printf("%d %d\n", results[i][0], results[i][1]);
        }
    }
}
