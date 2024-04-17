import java.util.*;

public class Solution {

  static int peopleCount(String s) {
    boolean ms=false;
    boolean fs=false;

    int countMale=0;
    int countFemale=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='U' && !ms){
        countMale++;
        fs=false;
        ms=true;
      }
      else if(s.charAt(i)=='u' && !fs){
        countMale++;
        fs=true;
        ms=false;

      }
    }
    return countFemale+countMale;
  }

  public static void main(String args[]) {

    assert (peopleCount("UfUfUf") == 1) : "Expect 1 for s=\"UfUfUf\"";
    System.out.println("All test cases in main function passed");

  }
}

