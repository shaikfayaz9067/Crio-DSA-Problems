import java.util.*;

public class Solution {
    String[] Fruit=new String[]{"apple","banana","orange"};
    // public Solution(String[] Fruit){
    //     this.Fruit=Fruit;
    // }
    Random rmd=new Random();
    public  String GetFruit(){
        return Fruit[rmd.nextInt(Fruit.length-1)];
        // return "banana";
    }



    public static void main(String args[]) {
        Solution obj1 = new Solution();
        System.out.println(obj1.GetFruit());
        Solution obj2 = new Solution();
        System.out.println(obj2.GetFruit());
    }
}

