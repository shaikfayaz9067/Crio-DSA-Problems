import java.util.*;

class PostfixExpression {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    static boolean isOperator(String s){
        if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*"))
            return true;
        
        return false;
    }

    static int evaluate(int first_element,int sec_element,char ch){
        switch(ch){
            case '+': return ( first_element + sec_element );
            case '-': return (sec_element - first_element );//( first_element - sec_element );
            case '*': return ( first_element * sec_element );
            case '/': return (sec_element/first_element);//( first_element / sec_element );
        }

        return 0;
    }

    // TODO: Implement this method
    static int postfixExpression(String exp) {

        int len = exp.length(); //length of string
        String[] str = exp.split(" "); // dont care for blank spaces
        int str_len = str.length; //string array length
        //System.out.println(str_len); // checking the length

        Stack<Integer> st = new Stack<Integer>();
         //pushing first integer
        int i=0;
        do{ //till the stack is not empty
            if(i>=str_len) break;
            if(!isOperator(str[i])){
                st.push(Integer.valueOf(str[i])); // push the integer
               //System.out.println( Integer.valueOf(str[i]));
            }
            else{ // if operator
                char ch = str[i].charAt(0); // get the operator
                int first_element = st.pop();
                int sec_element = st.pop();
                int result = evaluate(first_element,sec_element,ch);
                st.push(result);
            }  
            i++;
        }while(st.size()>=1);

        //System.out.print("Hogya"+);
        return st.pop();
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