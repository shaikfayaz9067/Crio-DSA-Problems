import java.util.*;

class Subsets {

    public void helper(int i, int n, List<Integer> res, List<List<Integer>> ans, int[] nums) {
        if (i == n) {
            ans.add(new ArrayList<>(res)); // Create a new ArrayList to avoid modifying the original one
            return;
        }
        // Include the current element
        res.add(nums[i]);
        helper(i + 1, n, res, ans, nums);
        res.remove(res.size() - 1); // Backtrack: remove the last element to explore other possibilities

        // Exclude the current element
        helper(i + 1, n, res, ans, nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums.length, new ArrayList<>(), ans, nums);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; ++i) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        List<List<Integer>> result = new Subsets().subsets(nums);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); ++i) {
            if (result.get(i).size() == 0) {
                System.out.println("null");
                continue;
            }
            for (int j = 0; j < result.get(i).size(); ++j) {
                System.out.printf("%d ", result.get(i).get(j));
            }
            System.out.println();
        }
    }
}
