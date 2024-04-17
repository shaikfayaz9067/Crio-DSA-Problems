import java.util.*;

class CountOccurrences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int res = countOccurrences(n, k, a);

        System.out.println(res);
    }

   static int first(int n,int k,int a[]){
        int l=0, r=n-1;

        while(l<=r){
            int mid=(l+r)/2;

            if(a[mid]==k && (mid==0||a[mid-1]<k)){
                return mid;
            }
            else if(k<=a[mid]){
               
                  r=mid-1;
            }
            else{
                  l=mid+1;
            }

        }
        return -1;

    }

   static int last(int n,int k,int a[]){
         int l=0, r=n-1;

        while(l<=r){
            int mid=(l+r)/2;

            if(a[mid]==k && (mid==n-1||a[mid+1]>k)){
                return mid;
            }
            else if(k>=a[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return -1;

    }

    static int countOccurrences(int n, int k, int a[]) {
        int f= first( n, k, a);
        // System.out.println("THe value of f "+f);
        if(f==-1){
            return 0;
        }

       int l= last(n, k,a);
        // System.out.println("THe value of l "+l);

    return l-f+1;
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