import java.util.*;

public class Solution {

    static boolean anagramCouples(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        List<Character> char1=new ArrayList<>();
        List<Character> char2=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
           Character ch= (Character)s1.charAt(i);
           char1.add(Character.toLowerCase(ch));
        }
         for(int i=0;i<s2.length();i++){
            Character ch= (Character)s2.charAt(i);
           char2.add(Character.toLowerCase(ch));    
             }
        Collections.sort(char1);
        Collections.sort(char2);
        // boolean result=false;

        
        
        for(int i=0;i<s1.length();i++){
            if(char1.get(i)!=char2.get(i)){
                 return false;
                }
            }
        return true;

    }

    public static void main(String args[]) {
        String s1 = "Liam";
        String s2 = "mila";
        assert anagramCouples(s1, s2) == true : "Expect true for s1 = \"Liam\" and s2 = \"mila\"";
        s1 = "Sia";
        s2 = "Sam";
        assert anagramCouples(s1, s2) == false: "Expect false for s1 = \"Sia\" and s2 = \"Sam\"";
        System.out.println("All test cases in main function passed");
    }
}

