import java.util.*;

class NextGreaterElementWithSameSetOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        System.out.print(nextGreaterElementWithSameSetOfDigits(n));
    }

 
   
    static int nextGreaterElementWithSameSetOfDigits(int n){

        String s=""+n;
         char ar[]=s.toCharArray();
         int result=findNext(ar,ar.length);
         return result;

    }
     static int findNext(char ar[], int n) 
    {
        int i;
          
  
        for (i = n - 1; i > 0; i--) 
        {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }

        if (i == 0) 
        {
            return -1;
        } 
        else 
        {
            int x = ar[i - 1], min = i;

            for (int j = i + 1; j < n; j++) 
            {
                if (ar[j] > x && ar[j] < ar[min]) 
                {
                    min = j;
                }
            }

            swap(ar, i - 1, min);

            Arrays.sort(ar, i, n);
            
            // System.out.println(ar);
            // make it this way res=res*10+(ar[k]-'0');
            int res=0;
           for(int k=0;k<ar.length;k++) {
             res=res*10+(ar[k]-'0');
            }


            return res;
        }
        // return -1;
    }

        static void swap(char ar[], int i, int j) 
    {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
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