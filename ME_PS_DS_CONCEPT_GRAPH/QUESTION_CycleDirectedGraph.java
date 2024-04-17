import java.util.*;

class CycleDirectedGraph{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] edges = new int[e][2];
        for(int i=0;i<e;i++){
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            edges[i][0]=a;
            edges[i][1]=b;
        }
        System.out.println(cycleDirectedGraph(n, edges));
        sc.close();
    }
    public static boolean dfs(int src,HashMap<Integer,List<Integer>> adj,boolean[] vis,boolean[] pathvisted){
        //  if(pathvisted[src]){
        //         return true;
        //     }
      if (pathvisted[src]) {
            return true; // Found a cycle
        }
        if (vis[src]) {
            return false; // Already visited, no cycle
        }

        vis[src] = true;
        pathvisted[src] = true;

        // Check neighbors for cycles
        List<Integer> neighbors = adj.get(src);
        for (Integer neighbor : neighbors) {
            if (dfs(neighbor, adj, vis, pathvisted)) {
                return true;
            }
        }

        // Backtrack
        pathvisted[src] = false;
        return false;
    }

    static int cycleDirectedGraph(int n, int[][] edges){
        // boolean res=false;
        HashMap<Integer,List<Integer>> adj=new HashMap<>();
        for(int i=1;i<=n;i++){
            adj.put(i,new ArrayList<>());
        }
        for(int[] edge:edges){
           int a=edge[0],b=edge[1];
           adj.get(a).add(b);
        }
        boolean[] vis=new boolean[n+1];
        boolean[] pathvisted=new boolean[n+1];

        for(int i=1;i<=n;i++){
            if(vis[i]!=true){
                if(dfs(i,adj,vis,pathvisted)==true){
                    return 1;
                }
            }
        }
        return 0;
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
