import java.io.*;
import java.util.*;
import java.lang.*;

public class LetterCombinationsOfPhoneNumber {
    public void loc(int ind,String input,String output,List<String> res, Map<Character,List<Character>> map){
        if(ind==input.length()){
            res.add(output);
            return;
        }
    
    char c=input.charAt(ind);
    for(char ch:map.get(c)){
        loc(ind+1,input,output+ch,res,map);
    }
        
    }

    public List<String> letterCombinationsOfPhoneNumber(String digits) {
        Map<Character,List<Character>> map=new HashMap<>();
        map.put('2',List.of('a','b','c'));
        map.put('3',List.of('d','e','f'));
        map.put('4',List.of('g','h','i'));
        map.put('5',List.of('j','k','l'));
        map.put('6',List.of('m','n','o'));
        map.put('7',List.of('p','q','r','s'));
        map.put('8',List.of('t','u','v'));
        map.put('9',List.of('w','x','y','z'));
        List<String> res=new ArrayList<>();
        
        loc(0,digits,"",res,map);
        return res;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        List<String> combinations = new LetterCombinationsOfPhoneNumber().letterCombinationsOfPhoneNumber(line);
        for (String cmbn : combinations)
            System.out.print(cmbn + " ");
    }
}
/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output

Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving and see if you can recollect solving similar problems in the past
      a. Obvious logic (this would only test ability to convert logic to code)
      b. Figuring out logic
      c. Knowledge of specific algorithm, data structure or pattern
      d. Knowledge of specific domain or concepts
      e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one based on the TC/SC requirements
3. Get to a point where you can explain your approach to a 10 year old

Milestone 3 : Come up with an Instruction Manual for a 10 year old
1. Take a stab at the high-level logic & write it down like a detailed Instruction Manual for a 10 Year old where each line of the manual can be expanded into a logical line(s) of code.
2. Try to offload logic out of the main section as much as possible by delegating to functions.

Milestone 4: Code by expanding your 10 Year Olds "Instruction Manual
1. Run your code snippets at every logical step to test correctness (Helps avoid debugging larger pieces of code later)
2. Make sure you name the variables, functions clearly.
3. Use libraries as much as possible

Milestone 5: Prove that your code works using custom test cases
1. Make sure you check boundary conditions and other test cases you noted in Milestone 1
      a. If compiler is not available, dry run your code on a whiteboard or paper
2. Suggest optimizations if applicable during interviews
*/