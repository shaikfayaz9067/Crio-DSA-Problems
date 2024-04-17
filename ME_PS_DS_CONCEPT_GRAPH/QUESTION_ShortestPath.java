import java.util.*;

class ShortestPath {
    public static int n;
    public static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < m; i++) {
            edges.add(new ArrayList<Integer>());
            edges.get(i).add(sc.nextInt());
            edges.get(i).add(sc.nextInt());
        }
        int source, destination;
        source = sc.nextInt();
        destination = sc.nextInt();
        sc.close();
        List<Integer> ans = shortestPath(n, edges, source, destination);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }

    // Implement Your Solution Here
    public static List<Integer> shortestPath(int n, ArrayList<ArrayList<Integer>> edges, int source,
            int destination) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();

        // Construct the adjacency list
        for (int i = 1; i <= n; i++) {
            adj.put(i, new ArrayList<>());
        }
        for (ArrayList<Integer> edge : edges) {
            int a = edge.get(0);
            int b = edge.get(1);
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        // Initialize distance and visited arrays
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        boolean[] visited = new boolean[n + 1];

        // BFS traversal
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int neighbor : adj.get(curr)) {
                if (!visited[neighbor]) {
                    dist[neighbor] = dist[curr] + 1;
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        // Reconstruct shortest path
        List<Integer> shortestPath = new ArrayList<>();
        int current = destination;
        shortestPath.add(current);
        while (current != source) {
            for (int neighbor : adj.get(current)) {
                if (dist[current] == dist[neighbor] + 1) {
                    shortestPath.add(neighbor);
                    current = neighbor;
                    break;
                }
            }
        }
        Collections.reverse(shortestPath);
        return shortestPath;
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