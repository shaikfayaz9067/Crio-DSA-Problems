import java.util.*;

public class ConnectedComponentsInGraph {

    public static void dfs(int src, HashMap<Integer, List<Integer>> adj, boolean[] vis) {
        vis[src] = true;

        for (int nbr : adj.get(src)) {
            if (!vis[nbr]) {
                dfs(nbr, adj, vis);
            }
        }
    }

    int connectedComponentsInGraph(int n, ArrayList<ArrayList<Integer>> edges) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (ArrayList<Integer> edge : edges) {
            int a = edge.get(0);
            int b = edge.get(1);
            adj.get(a).add(b);
            adj.get(b).add(a); // Considering undirected graph
        }

        int count = 0;
        boolean[] vis = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            edges.add(new ArrayList<>());
            edges.get(i).add(scanner.nextInt());
            edges.get(i).add(scanner.nextInt());
        }
        ConnectedComponentsInGraph answer = new ConnectedComponentsInGraph();
        int result = answer.connectedComponentsInGraph(n, edges);
        System.out.println(result);
        scanner.close();
    }
}
