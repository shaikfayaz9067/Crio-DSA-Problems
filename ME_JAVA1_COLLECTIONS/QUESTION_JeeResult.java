import java.util.*;

public class Solution {

    static String jeeResult(String marks) {
      String[] str=marks.trim().split(" ");
      List<Integer> list=new ArrayList<>();
      for(String st:str){
        list.add(Integer.parseInt(st));
      }
      Collections.sort(list);
      return Collections.max(list)+" "+Collections.min(list);
    }

    public static void main(String args[]) {

      assert (jeeResult("4 2 -13 4 5").equals("5 -13")) :  "Expect \"5 -13\" for s=\"4 2 -13 4 5\"" ;
      System.out.println("All test cases in main function passed");

    }
}

