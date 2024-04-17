import java.util.*;

public class Solution {

    static int getNthFibonacciNumber(int N) {
        if(N==0){
            return 0;
        }
        else if(N==1 || N==2){
            return 1;
        }
        else {
            return getNthFibonacciNumber(N-1)+getNthFibonacciNumber(N-2);
        }
    }

    public static void main(String args[]) {

        assert (getNthFibonacciNumber(3) == 2) : "Expect \"2\" for N = 3";
        assert (getNthFibonacciNumber(4) == 3) : "Expect \"3\" for N = 4";
        System.out.println("All test cases in main function passed");


    }
}

