import java.util.*;

public class Solution {

  static Boolean balancedToken(String name) {
    if(name.length()==0){
      return true;
    }

   char[] ch=name.toCharArray();
    
    HashSet<Character> hash=new HashSet<>();
    for(char c:ch){
      hash.add(Character.toLowerCase(c));
    }
    int sizeSet=hash.size();
    int sizeArr=name.length();
    if(sizeArr%sizeSet!=0){
      return false;
    }
    else{
      return true;
    }

  }

  public static void main(String args[]) {
    assert balancedToken("Dererd") == true : "Expect true for input =\"Dererd\"";
    System.out.println("All test cases in main function passed");
  }
}

