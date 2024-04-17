import java.util.*;

class TwoNonRepeatingNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int ans[] = twoNonRepeatingNumbers(nums);
        System.out.println(ans[0]+" "+ans[1]);
        sc.close();
    }

    static int[] twoNonRepeatingNumbers(int[] nums) {

        Map<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
            
        }
        // mp.forEach((key,value)->{
        //     System.out.println(key+" "+value);
        // });
        ArrayList<Integer> ar=new ArrayList<>();
        // int[] arr=new int[2];
        // mp.forEach((key,value)->{
        //     int i=0;
        //      if(value==1){
        //          arr[i]=key;
        //          i++;
        //      }
        // });
       for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
           if(entry.getValue()==1){
               ar.add(entry.getKey());
           }

       }
      int[] arr = ar.stream().mapToInt(i -> i).toArray();



        Arrays.sort(arr);

        return arr;




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