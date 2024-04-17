import java.util.*;

class CourseSchedule {
    public static boolean courseSchedule(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        
   
        for (int i = 1; i <= numCourses; i++) {
            adj.put(i, new ArrayList<>());
        }
    
            for (int[] prerequisite : prerequisites) {
                int a = prerequisite[0];
                int b = prerequisite[1];
                adj.get(a).add(b);
            }
        

        boolean[] visited = new boolean[numCourses+1];
        boolean[] recStack = new boolean[numCourses+1];

        for (int i = 1; i <= numCourses; i++) {
            if (isCyclic(i, adj, visited, recStack)) {
                return false;
            }
        }

        return true;
    }

    private static boolean isCyclic(int v, HashMap<Integer, List<Integer>> adj, boolean[] visited, boolean[] recStack) {
        if (recStack[v]) {
            return true; // Found a cycle
        }
        if (visited[v]) {
            return false; // Already visited, no cycle
        }

        visited[v] = true;
        recStack[v] = true;

        // Check neighbors for cycles
        List<Integer> neighbors = adj.get(v);
        for (Integer neighbor : neighbors) {
            if (isCyclic(neighbor, adj, visited, recStack)) {
                return true;
            }
        }

        // Backtrack
        recStack[v] = false;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of courses
        int m = sc.nextInt(); // Number of prerequisites
        int[][] edgeList = new int[m][2];
        for (int i = 0; i < m; i++) {
            edgeList[i][0] = sc.nextInt(); // Course
            edgeList[i][1] = sc.nextInt(); // Prerequisite
        }
        boolean ans = courseSchedule(n, edgeList);
        System.out.println(ans);
    }
}
