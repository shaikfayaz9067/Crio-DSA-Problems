import java.util.*;

// Implement your solution here
class LongestSubstringWithAtMostKDistinctCharacter {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {

        int l=0,r=0,maxlen=0;
        if(s.length()==0||k==0){
            return 0;
        }

        Map<Character, Integer> map=new HashMap<>();

        for(;r<s.length();r++){
            char last= s.charAt(r);
            map.put(last,map.getOrDefault(last,0)+1);
            while(map.size()>k){

               char first=s.charAt(l);
               map.put(first,map.get(first)-1);
               if(map.get(first)==0){
                map.remove(first);
                }
                l++;

             }
            maxlen=Math.max(maxlen,r-l+1);

        }

        return maxlen;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
	    scanner.nextLine();
        String s = scanner.nextLine();
        scanner.close();

        int result = new LongestSubstringWithAtMostKDistinctCharacter().lengthOfLongestSubstringKDistinct(s,k);
        System.out.println(result);
    }
}

/* 
  Crio Methodology
  
  Milestone 1: Understand the problem clearly
  1. Ask questions & clarify the problem statement clearly.
  2. *Type down* an example or two to confirm your understanding of the input/output & extend it to test cases
  
  Milestone 2: Finalize approach & execution plan
  1. Understand what type of problem you are solving.
       a. Obvious logic, tests ability to convert logic to code
       b. Figuring out logic
       c. Knowledge of specific domain or concepts
       d. Knowledge of specific algorithm
       e. Mapping real world into abstract concepts/data structures
  2. Brainstorm multiple ways to solve the problem and pick one
  3. Get to a point where you can explain your approach to a 10 year old
  4. Take a stab at the high-level logic & *type it down*.
  5. Try to offload processing to functions & keeping your main code small.
  
  Milestone 3: Code by expanding your pseudocode
  1. Have frequent runs of your code, dont wait for the end
  2. Make sure you name the variables, functions clearly.
  3. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
  4. Use libraries as much as possible
  
  Milestone 4: Prove to the interviewer that your code works with unit tests
  1. Make sure you check boundary conditions
  2. Time & storage complexity
  3. Suggest optimizations if applicable
  */