import java.util.*;

public class Solution {
    public Set<Integer> setx = new HashSet<>();

    public void AddAll(int[] numbers) {
        for (int number : numbers) {
            setx.add(number);
        }
    }

    public void removal(short number) {
        setx.remove((int)number);
    }

    public String showContent() {
        return Arrays.toString(setx.toArray());
    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        obj.AddAll(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        obj.removal((short)9);
        assert obj.showContent().equals("[1, 2, 3, 4, 5, 6, 7, 8, 10]") : "Expect [1, 2, 3, 4, 5, 6, 7, 8, 10] when the input is [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and 9 is removed" ;
        System.out.println("All test cases in main function passed");
    }
}

