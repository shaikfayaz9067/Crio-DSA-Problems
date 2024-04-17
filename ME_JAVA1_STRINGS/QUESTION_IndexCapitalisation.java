import java.util.*;

public class Solution {

    static String indexCapitalisation(String s, int[] ind) {
        StringBuilder result=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(i==ind[j]){
                result.append(Character.toUpperCase(s.charAt(i)));
                if(j<ind.length-1){
                    j++;
                }
            }
            else{
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String args[]) {
        String s = "learn by doing";
        int[] ind = new int[] { 0, 6, 9 };
        assert (indexCapitalisation(s, ind).equals("Learn By Doing")) : "Expect \"Learn By Doing\" for s = \"learn by doing\" and ind = [0, 6, 9]";

        System.out.println("All test cases in main function passed");

    }
}

