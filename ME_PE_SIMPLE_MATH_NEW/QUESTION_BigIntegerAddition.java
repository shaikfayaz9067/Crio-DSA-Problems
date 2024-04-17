import java.util.*;

class BigIntegerAddition {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        String ans = bigIntegerAddition(num1, num2);
        System.out.println(ans);

    }

    // TODO: Implement this method
    static String bigIntegerAddition(String str1, String str2) {
         if (str1.length() > str2.length()){ 
        String t = str1;
        str1 = str2;
        str2 = t;
    }
 
    // Take an empty String for storing result 
    String str = ""; 
 
    // Calculate length of both String 
    int n1 = str1.length(), n2 = str2.length(); 
 
    // Reverse both of Strings
    str1=new StringBuilder(str1).reverse().toString();
    str2=new StringBuilder(str2).reverse().toString();
 
    int carry = 0; 
       for (int i = 0; i < n1; i++) 
    { 
        // Do school mathematics, compute sum of 
        // current digits and carry 
        int sum = ((int)(str1.charAt(i) - '0') + 
                    (int)(str2.charAt(i) - '0') + carry); 
        str += (char)(sum % 10 + '0'); 
 
        // Calculate carry for next step 
        carry = sum / 10; 
    } 
 
    // Add remaining digits of larger number 
    for (int i = n1; i < n2; i++) 
    { 
        int sum = ((int)(str2.charAt(i) - '0') + carry); 
        str += (char)(sum % 10 + '0'); 
        carry = sum / 10; 
    } 
        // Add remaining carry 
    if (carry > 0) 
        str += (char)(carry + '0'); 
 
    // reverse resultant String
    str = new StringBuilder(str).reverse().toString();
 
    return str; 
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