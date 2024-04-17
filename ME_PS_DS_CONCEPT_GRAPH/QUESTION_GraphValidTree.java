import java.util.*;
import java.lang.Integer;

class GraphValidTree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] edges = new int[m][2];
            for(int i=0;i<m;i++){
                int a,b;
                a = sc.nextInt();
                b = sc.nextInt();
                edges[i][0] = a;
                edges[i][1] = b;
            }
            System.out.println(graphValidTree(n,edges));
        
        sc.close();
    }
public static boolean dfs(int src,HashMap<Integer,List<Integer>> adj,boolean[] vis,int parent){
		if(vis[src]==true){
			return true;
		}
		
		vis[src]=true;

		for(int nbr:adj.get(src)){
			if(nbr==parent) continue;
			if(dfs(nbr,adj,vis,src)==true){
				return true;
			}
		}
		return false;
       
    }
    
    static int graphValidTree(int n, int[][] edges){
         HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] vis=new boolean[n];


 
        boolean res=dfs(0,adj,vis,-1)?false:true;
        boolean connected=true;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                connected=false;
            }
        }
        
        return res&&connected?1:0;
            
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