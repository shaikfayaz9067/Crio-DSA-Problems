import java.util.*;

class RottingOranges{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while((t--)>0){
            int n,m;
            n= sc.nextInt();
            m=sc.nextInt();
            ArrayList<ArrayList<Integer> > a = new ArrayList<ArrayList<Integer> >();
            for(int i=0;i<n;i++){
                a.add(new ArrayList<Integer>());
            }
            for(int i=0;i<n;i++){
                for(int j = 0;j<m;j++){
                    a.get(i).add(sc.nextInt());
                }
            }
            int ans  = RottingOranges.rottingOranges(a);
            System.out.println(ans);
        }
        sc.close();
    }
    public static class Pair{
        int row, col,time;

        Pair(int row, int col, int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }
    }

    public static int rottingOranges(ArrayList<ArrayList<Integer> > a){
        Queue<Pair> q=new ArrayDeque<>();

        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(0).size();j++){
                if(a.get(i).get(j)==2){
                    q.offer(new Pair(i,j,0));
                }
            }
        }
        int maxTime=0;
        while(q.size()!=0){
            Pair p=q.remove();
            
            int[] dc={-1,0,1,0};
            int[] dr={0,1,0,-1};

            for(int i=0;i<4;i++){
             int newRow = p.row + dr[i];
                int newCol = p.col + dc[i];
                if(newRow >= 0 && newRow < a.size() && newCol >= 0 && newCol < a.get(0).size() && a.get(newRow).get(newCol) == 1){
                    q.offer(new Pair(newRow, newCol, p.time + 1));
                    maxTime = p.time + 1;
                    a.get(newRow).set(newCol, 2);
                }
            }
            }
        
         for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(0).size();j++){
                if(a.get(i).get(j)==1){
                    // q.offer(new Pair(i,j,0));
                    return -1;
                }
            }
        }
        return maxTime;

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